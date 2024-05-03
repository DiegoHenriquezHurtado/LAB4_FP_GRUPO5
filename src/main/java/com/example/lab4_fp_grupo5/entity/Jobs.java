package com.example.lab4_fp_grupo5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "jobs")
public class Jobs {

    @Id
    @Column(name="job_id",nullable = false)
    private String jobId;

    @Column(name="job_title",nullable = true)
    private String jobTitle;

    @Column(name="min_salary",nullable = true)
    private Integer minSalary;

    @Column(name="max_salary",nullable = true)
    private Integer maxSalary;
}
