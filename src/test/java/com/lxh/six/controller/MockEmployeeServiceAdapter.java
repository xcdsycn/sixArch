package com.lxh.six.controller;

import com.lxh.six.entity.Employee;
import com.lxh.six.repository.EmployeeRepositoryPort;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MockEmployeeServiceAdapter implements EmployeeRepositoryPort {
    @Override
    public void create(String name, String role, long salary) {
       log.info("===> name:{}, role:{}, salary:{}", name, role, salary);
    }

    @Override
    public Employee getEmployee(Integer userId) {
        Employee employee = new Employee();
        employee.setId(userId);
        employee.setName("UT name");
        employee.setRole("UT role");
        employee.setSalary(900L);
        return employee;
    }
}
