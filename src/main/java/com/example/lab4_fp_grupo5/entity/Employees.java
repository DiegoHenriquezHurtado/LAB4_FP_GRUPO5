package com.example.lab4_fp_grupo5.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Getter
@Setter
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="employee_id",nullable = false)
    private int employeeId;

    @NotBlank
    @NotNull
    @Column(name="first_name",nullable = true)
    private String firstName;

    @NotBlank
    @NotNull
    @Column(name="last_name",nullable = true)
    private String lastName;

    @NotBlank
    @NotNull
    @Column(name="email",nullable = true)
    private String email;

    @NotBlank
    @NotNull
    @Size(min = 8, message = "La contraseña debe tener por lo menos 8 caracteres")
    @Column(name="password",nullable = true)
    private String password;

    @Column(name="phone_number",nullable = true)
    private String phoneNumber;


    @Column(name="hire_date",nullable = true)
    private Date hireDate;

    @NotBlank
    @NotNull
    @Column(name="salary",nullable = true)
    private BigDecimal salary;

    @Column(name="commission_pct",nullable = true)
    private BigDecimal commissionpct;

    @Column(name="enabled",nullable = true)
    private Integer enabled;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobs;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employees manager;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = true)
    private Departments departments;
}
