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
@Table(name = "regions")
public class Regions {

    @Id
    @Column(name = "region_id")
    private int id;
    @Column(name = "region_name")
    private String regioname;

}
