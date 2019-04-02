package com.lxh.six.port;

import com.lxh.six.domain.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author lxh
 */
@Api(value = "employeeAPI", description = "employee接口")
public interface EmployeeUiPort {
    /**
     * create user
     *
     * @param request
     */
    @ApiOperation("创建employee")
    @PostMapping("create")
    void create(@RequestBody Employee request);

    /**
     * get employee
     *
     * @param userId
     * @return
     */
    @ApiOperation("get employee")
    @GetMapping("view/{userId}")
    Employee view(@PathVariable Integer userId);
}
