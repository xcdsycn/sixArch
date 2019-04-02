package com.lxh.six.service;

import com.lxh.six.port.EmployeeRepositoryPort;
import com.lxh.six.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepositoryPort employeeRepository;

    public void create(String name, String role, long salary){
        employeeRepository.create(name, role, salary);
    }
    public Employee view(Integer userId){
        return employeeRepository.getEmployee(userId);
    }
}
