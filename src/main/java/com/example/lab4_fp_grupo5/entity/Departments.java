package com.example.lab4_fp_grupo5.entity;

import jakarta.persistence.*;


@Entity
@Table(name="departments")
public class Departments {

    @Id
    @Column(name = "department_id")
    private int id;
    @Column(name = "department_name")
    private String departmentname;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees managerid;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Locations locationid;


}
