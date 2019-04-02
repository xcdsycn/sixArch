package com.lxh.six.adapter;

import com.lxh.six.port.EmployeeUiPort;
import com.lxh.six.domain.Employee;
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
public class EmployeeControllerAdapter implements EmployeeUiPort {
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
