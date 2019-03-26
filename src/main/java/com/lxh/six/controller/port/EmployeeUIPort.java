package com.lxh.six.controller.port;

import com.lxh.six.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author lxh
 */
public interface EmployeeUIPort {

    @PostMapping("create")
    public void create(@RequestBody Employee request);

    @GetMapping("view/{id}")
    public Employee view(@PathVariable Integer userId);
}
