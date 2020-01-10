package com.ds.testask.departmentdemo.entity;


import javax.persistence.*;

@Entity
@Table(name = "department_employee")
public class DepartmentEmployee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double salary;


    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "fk_employee_id"))
    private Employee employee;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "department_id", foreignKey = @ForeignKey(name = "fk_department_id"))
    private Department department;

    @Convert(converter = PositionConverter.class)
    private Position position;


    public DepartmentEmployee() {
    }

    public DepartmentEmployee(long id) {
        this.id = id;
    }

    public DepartmentEmployee(long id, double salary, Employee employee, Department department, Position position) {
        this.id = id;
        this.salary = salary;
        this.employee = employee;
        this.department = department;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
