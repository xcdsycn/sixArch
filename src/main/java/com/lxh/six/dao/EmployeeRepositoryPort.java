package com.lxh.six.dao;

import com.lxh.six.entity.Employee;

public interface EmployeeRepositoryPort {

    void create(String name, String role, long salary);

    Employee getEmployee(Integer userId);
}
