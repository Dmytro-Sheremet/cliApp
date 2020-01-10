package com.ds.testask.departmentdemo.service;

import com.ds.testask.departmentdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findEmployeeByNameLike(String nameCharSequence);

}
