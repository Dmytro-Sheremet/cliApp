package com.ds.testask.departmentdemo.repo;

import com.ds.testask.departmentdemo.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
