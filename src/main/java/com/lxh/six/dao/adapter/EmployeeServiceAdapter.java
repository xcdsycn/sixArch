package com.lxh.six.dao.adapter;

import com.lxh.six.dao.EmployeeMapper;
import com.lxh.six.dao.EmployeeRepositoryPort;
import com.lxh.six.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceContext;

/**
 * @author lxh
 */
@Service
public class EmployeeServiceAdapter implements EmployeeRepositoryPort {

    @PersistenceContext
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
