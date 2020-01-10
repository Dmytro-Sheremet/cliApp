package com.ds.testask.departmentdemo.repo;

import com.ds.testask.departmentdemo.entity.Degree;
import com.ds.testask.departmentdemo.entity.DepartmentEmployee;
import com.ds.testask.departmentdemo.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DepartmentEmployeeRepository extends CrudRepository<DepartmentEmployee, Long> {

    @Query("SELECT " +
            "e " +
            "FROM " +
            "DepartmentEmployee de, " +
            "Employee e, " +
            "Department d " +
            "WHERE " +
            "e.id = de.employee.id AND " +
            "de.department.id = d.id AND " +
            "de.position = 'HEAD' AND " +
            "d.title = :title")
    Employee findHeadOfDepartmentByDepartmentName(@Param("title") String departmentName);


    @Query("SELECT " +
            "count(de.id) " +
            "FROM " +
            "DepartmentEmployee de, " +
            "Employee e, " +
            "Department d " +
            "WHERE " +
            "e.id = de.employee.id AND " +
            "de.department.id = d.id AND " +
            "d.title = :title AND "+
            "e.degree = :degree"
    )
    long getCountOfDegreeOFDepartmentEmployees(
            @Param("degree") Degree degree,
            @Param("title") String departmentName
    );


    @Query("SELECT " +
            "avg(de.salary) " +
            "FROM " +
            "DepartmentEmployee de, " +
            "Department d " +
            "WHERE " +
            "de.department.id = d.id AND " +
            "d.title = :title")
    double getAverageSalaryOfDepartment(@Param("title") String departmentName);

    @Query("SELECT " +
            "count(de.id) " +
            "FROM " +
            "DepartmentEmployee de, " +
            "Department d " +
            "WHERE " +
            "de.department.id = d.id AND " +
            "d.title = :title")
    long getCountOfEmployeesOFDepartment(@Param("title") String departmentName);

}
