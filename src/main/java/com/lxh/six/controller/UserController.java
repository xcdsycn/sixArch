package com.lxh.six.controller;

import com.lxh.six.dto.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "UserApi", description = "用户接口")
@RestController
public class UserController {


    @ApiOperation("获取当前登录用户详情")
    @GetMapping("/user")
    public Result getCurrentSSOUserDetail() {
        return Result.success();
    }

}
