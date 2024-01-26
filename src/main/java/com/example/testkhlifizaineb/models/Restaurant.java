package com.example.testkhlifizaineb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Restaurant")

public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRestaurant")
    private long idRestaurant;

    @Column(name="nom")
    private String nom;

    @Column(name="nbplacesMax")
    private long nbPlacesMax;


    @OneToMany
    @JoinColumn(name="idRestaurant")
    private List<Menu> menus;

}
