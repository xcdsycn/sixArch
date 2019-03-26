package com.lxh.six.aop;

import com.lxh.six.dto.Result;
import com.lxh.six.enums.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Slf4j
@Component
@Aspect
public class HibernateValidatorAspect {

    /**
     * 所有controller及api入口@Valid方式校验
     */
    @Pointcut("( execution(public * com.lxh.service.six.controller..*.*(..)) ) && args(..,org.springframework.validation.BindingResult)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] objects = joinPoint.getArgs();
        for (Object o : objects) {
            if (o instanceof BindingResult) {
                BindingResult result = (BindingResult) o;
                if (result.hasErrors()) {
                    log.warn("Request params is invalid|class is {}, method is {}|{}",
                            joinPoint.getTarget().getClass().getName(),
                            joinPoint.getSignature().getName(),
                            result.getFieldError().getDefaultMessage());
                    return Result.fail(ErrorCodeEnum.INPUT_INVALID, result.getFieldError().getDefaultMessage());
                }
            }
        }
        return joinPoint.proceed();
    }
}
