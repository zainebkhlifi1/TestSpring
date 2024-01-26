package com.example.testkhlifizaineb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="composant")
public class Composant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idComposant")
    private long idComposant;

    @Column(name="nomComposant")
    private String nomComposant;

    @Column(name="datePremierVisite")
    private Float prix;

@ManyToOne
    @JoinColumn(name="menu_id")
    private Menu menu;



}
