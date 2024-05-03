package com.example.lab4_fp_grupo5.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "job_history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_history_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employees employeeid;
    @Column(name = "start_date")
    private Date hiredate;
    @Column(name = "end_date",nullable = false)
    private Date enddate;
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobid;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments departmentid;


}
