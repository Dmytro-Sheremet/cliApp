package com.ds.testask.departmentdemo.service;


import com.ds.testask.departmentdemo.entity.Degree;
import com.ds.testask.departmentdemo.entity.Employee;

import java.util.Map;

public interface DepartmentService {

    Employee findHeadOfDepartment(String fullDepartmentName);

    Map<Degree, Long> getDepartmentStatistics(String fullDepartmentName);

    double getAverageSalaryOfDepartment(String fullDepartmentName);

    long getCountOfDepartmentEmployees(String fullDepartmentName);

}
