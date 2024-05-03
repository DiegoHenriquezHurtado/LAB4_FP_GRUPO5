package com.example.lab4_fp_grupo5.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "countries")
public class Countries {

    @Id
    @Column(name = "country_id")
    private String id;
    @Column(name = "country_name")
    private String countryname;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Regions regionid;


}
