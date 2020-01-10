package com.ds.testask.departmentdemo.service;


import com.ds.testask.departmentdemo.entity.Employee;
import com.ds.testask.departmentdemo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> findEmployeeByNameLike(String nameCharSequence) {
        return employeeRepository.findHeadOfDepartmentByDepartmentName(nameCharSequence);
    }
}
