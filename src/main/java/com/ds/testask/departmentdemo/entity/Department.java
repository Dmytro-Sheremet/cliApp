package com.ds.testask.departmentdemo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String title;

    @OneToMany(mappedBy = "department")
    private Set<DepartmentEmployee> departmentEmployees;

    public Department() {
    }

    public Department(long id) {
        this.id = id;
    }

    public Department(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<DepartmentEmployee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void setDepartmentEmployees(Set<DepartmentEmployee> departmentEmployees) {
        this.departmentEmployees = departmentEmployees;
    }

}
