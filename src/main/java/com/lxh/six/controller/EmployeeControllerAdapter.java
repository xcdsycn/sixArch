package com.lxh.six.controller;

import com.lxh.six.controller.port.EmployeeUIPort;
import com.lxh.six.entity.Employee;
import com.lxh.six.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxh
 */
@RestController
@RequestMapping("/employees/")
public class EmployeeControllerAdapter implements EmployeeUIPort {
    @Autowired
    private EmployeeService employeeService;

    @Override
    public void create(@RequestBody Employee request) {
        employeeService.create(request.getName(), request.getRole(), request.getSalary());
    }
    @Override
    public Employee view(@PathVariable Integer id) {
        Employee employee = employeeService.view(id);
        return employee;
    }
}
