package com.example.lab4_fp_grupo5.repository;



import com.example.lab4_fp_grupo5.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentsRepository extends JpaRepository<Departments,Integer> {


}
