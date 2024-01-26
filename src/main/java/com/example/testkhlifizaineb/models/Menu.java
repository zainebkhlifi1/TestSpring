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
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMenu")
    private long idMenu;

    @Column(name="libelle")
    private String libelleMenu;

    @Column(name="typeMenu")
    private String typeMenu;

    @Column(name="prixTotal")
    private Float prixTotal;

@ManyToMany(mappedBy = "menus")
    private List<Client> clients;

}
