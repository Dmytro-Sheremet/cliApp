package com.ds.testask.departmentdemo.tempHelper;

import com.ds.testask.departmentdemo.entity.*;
import com.ds.testask.departmentdemo.repo.DepartmentEmployeeRepository;
import com.ds.testask.departmentdemo.repo.DepartmentRepository;
import com.ds.testask.departmentdemo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBInitialDataFillerImpl implements DBInitialDataFiller {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    private DepartmentEmployeeRepository departmentEmployeeRepository;

    @Autowired
    public DBInitialDataFillerImpl(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, DepartmentEmployeeRepository departmentEmployeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.departmentEmployeeRepository = departmentEmployeeRepository;
    }

    private long salaryGen() {
        return Math.round(Math.random() * 5000 + 1000);
    }

    @Override
    public void fillIntoDB() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0, "Albert", "ZweiStein", "az@gmail.com", "+380674960858", Degree.PROFESSOR));
        employees.add(new Employee(0, "Oliver", "Smith", "osmith@gmail.com", "+180674960858", Degree.PROFESSOR));
        employees.add(new Employee(0, "Isla", "Brown", "islabonita@gmail.com", "+280674960858", Degree.ASSOCIATE_PROFESSOR));
        employees.add(new Employee(0, "Oscar", "Evans", "oevans@gmail.com", "+380674960858", Degree.ASSOCIATE_PROFESSOR));
        employees.add(new Employee(0, "James", "Thomas", "jt@gmail.com", "+480674960858", Degree.ASSOCIATE_PROFESSOR));
        employees.add(new Employee(0, "William", "Taylor", "wtaylor@gmail.com", "+580674960858", Degree.ASSOCIATE_PROFESSOR));
        employees.add(new Employee(0, "Jack", "Miller", "jackmiller@gmail.com", "+680674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Jacob", "Martin", "jmartin@gmail.com", "+780674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Daniel", "White", "dwhite@gmail.com", "+880674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Emma", "Davis", "edavis@gmail.com", "+980674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Emily", "Anderson", "eandersdaughter@gmail.com", "+100674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Mia", "Wang", "miwa@gmail.com", "+180674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Michael", "Li", "mili@gmail.com", "+120674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Robert", "Smith", "rosmith@gmail.com", "+130674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "David", "Roy", "droy@gmail.com", "+140674960858", Degree.ASSISTANT));
        employees.add(new Employee(0, "Noah", "Morton", "nmorton@gmail.com", "+150674960858", Degree.ASSISTANT));
        employeeRepository.saveAll(employees);

        List<Department> departments = new ArrayList<>();
        departments.add(new Department(0, "Music Academy"));
        departments.add(new Department(0, "Institute of Technology"));
        departmentRepository.saveAll(departments);


        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(1L).get(), departmentRepository.findById(1L).get(), Position.HEAD));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(2L).get(), departmentRepository.findById(2L).get(), Position.HEAD));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(3L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(4L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(5L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(6L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(7L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(8L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(9L).get(), departmentRepository.findById(1L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(10L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(11L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(12L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(13L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(14L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(15L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(16L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(1L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(2L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(3L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));
        departmentEmployeeRepository.save(new DepartmentEmployee(0, salaryGen(), employeeRepository.findById(4L).get(), departmentRepository.findById(2L).get(), Position.LECTOR));

    }
}