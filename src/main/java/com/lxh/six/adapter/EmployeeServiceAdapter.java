package com.lxh.six.adapter;

import com.lxh.six.dao.EmployeeMapper;
import com.lxh.six.port.EmployeeRepositoryPort;
import com.lxh.six.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author lxh
 */
@Service
public class EmployeeServiceAdapter implements EmployeeRepositoryPort {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void create(String name, String role, long salary) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setRole(role);
        employee.setSalary(salary);
        employeeMapper.insertSelective(employee);
    }

    @Override
    public Employee getEmployee(Integer userId) {
        return employeeMapper.selectByPrimaryKey(userId);
    }
}
