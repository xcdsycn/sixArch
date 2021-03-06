package com.lxh.six.repository.adapter;

import com.lxh.service.six.service.AbstractTestBase;
import com.lxh.six.port.EmployeeRepositoryPort;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceAdapterTest extends AbstractTestBase {

    @Autowired
    private EmployeeRepositoryPort employeeRepositoryPort;

    @Test
    public void create() {
        employeeRepositoryPort.create("lxh","roleA",50000L);
    }

    @Test
    public void getEmployee() {
        printJson(employeeRepositoryPort.getEmployee(1));
    }
}