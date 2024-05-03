package com.example.lab4_fp_grupo5.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name = "locations")
public class Locations {

    @Id
    @Column(name = "location_id")
    private int id;
    @Column(name = "street_address")
    private String streetaddress;
    @Column(name = "postal_code")
    private String postalcode;
    @Column(nullable = false)
    private String city;
    @Column(name = "state_province")
    private String stateprovince;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries countryid;


}
