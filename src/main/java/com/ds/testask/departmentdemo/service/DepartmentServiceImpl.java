package com.ds.testask.departmentdemo.service;


import com.ds.testask.departmentdemo.entity.Degree;
import com.ds.testask.departmentdemo.entity.Employee;
import com.ds.testask.departmentdemo.repo.DepartmentEmployeeRepository;
import com.ds.testask.departmentdemo.repo.DepartmentRepository;
import com.ds.testask.departmentdemo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentEmployeeRepository departmentEmployeeRepository;
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentEmployeeRepository departmentEmployeeRepository,
                                 DepartmentRepository departmentRepository
    ) {
        this.departmentEmployeeRepository = departmentEmployeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Employee findHeadOfDepartment(String fullDepartmentName) {
        return departmentEmployeeRepository.findHeadOfDepartmentByDepartmentName(
                fullDepartmentName
        );

    }

    @Override
    public Map<Degree, Long> getDepartmentStatistics(String fullDepartmentName) {

        Map<Degree, Long> departmentStatistics = new HashMap<>();


        departmentStatistics.put(
                Degree.ASSISTANT,
                departmentEmployeeRepository.getCountOfDegreeOFDepartmentEmployees(
                        Degree.ASSISTANT,
                        fullDepartmentName
                )
        );


        departmentStatistics.put(
                Degree.ASSOCIATE_PROFESSOR,
                departmentEmployeeRepository.getCountOfDegreeOFDepartmentEmployees(
                        Degree.ASSOCIATE_PROFESSOR,
                        fullDepartmentName
                )
        );

        departmentStatistics.put(
                Degree.PROFESSOR,
                departmentEmployeeRepository.getCountOfDegreeOFDepartmentEmployees(
                        Degree.PROFESSOR,
                        fullDepartmentName
                )
        );
        return departmentStatistics;
    }

    @Override
    public double getAverageSalaryOfDepartment(String fullDepartmentName) {
        return Math.round(departmentEmployeeRepository.getAverageSalaryOfDepartment(fullDepartmentName));
    }

    @Override
    public long getCountOfDepartmentEmployees(String fullDepartmentName) {
        return departmentEmployeeRepository.getCountOfEmployeesOFDepartment(fullDepartmentName);
    }
}
