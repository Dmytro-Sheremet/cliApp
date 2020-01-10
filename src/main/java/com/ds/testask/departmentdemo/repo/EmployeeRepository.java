package com.ds.testask.departmentdemo.repo;

import com.ds.testask.departmentdemo.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("SELECT " +
            "e " +
            "FROM " +
            "Employee e " +
            "WHERE " +
            "e.firstName LIKE %:searchQuery% OR " +
            "e.lastName LIKE %:searchQuery% OR " +
            "e.email LIKE %:searchQuery% OR " +
            "e.mobilePhoneNumber LIKE %:searchQuery% OR " +
            "e.degree LIKE %:searchQuery% ")
    List<Employee> findHeadOfDepartmentByDepartmentName(@Param("searchQuery") String searchCharactersSequence);

}
