package com.example.testkhlifizaineb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Client")

public class Client {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="idClient")
   private long idClient;

    @Column(name="identifiant")
    private String identifiant;

    @Column(name="datePremierVisite")
    private LocalDate datePremierVisite;

@ManyToMany
@JoinTable(
       name="commande",
            joinColumns = @JoinColumn(name="cleint_id"),
            inverseJoinColumns = @JoinColumn(name="menu_id")
    )
    private List<Menu> menus;


}
