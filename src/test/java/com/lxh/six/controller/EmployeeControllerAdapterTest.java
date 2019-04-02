package com.lxh.six.controller;

import com.alibaba.fastjson.JSON;
import com.lxh.six.domain.Employee;
import com.lxh.six.port.EmployeeRepositoryPort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerAdapterTest {

    @InjectMocks
    private EmployeeRepositoryPort employeeRepositoryPort = new MockEmployeeServiceAdapter();


    @Test
    public void create() {
        Employee employee = new Employee();
        employee.setSalary(9000L);
        employee.setRole("role UT");
        employee.setName("Name UT");
    }

    @Test
    public void view() {
        System.out.println(JSON.toJSONString(employeeRepositoryPort.getEmployee(1)));
    }
}