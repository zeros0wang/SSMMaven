package com.southwind.service;

import com.southwind.dao.EmployeeDAO;
import com.southwind.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> queryAll() {
        // TODO Auto-generated method stub
        return employeeDAO.queryAll();
    }
}
