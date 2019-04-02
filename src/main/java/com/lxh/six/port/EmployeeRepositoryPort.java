package com.lxh.six.port;

import com.lxh.six.domain.Employee;

public interface EmployeeRepositoryPort {

    void create(String name, String role, long salary);

    Employee getEmployee(Integer userId);
}
