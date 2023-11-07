package entities;

import javax.persistence.*;
import java.util.*;


@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private int nombreDePages;
    private String editeur;
    //private List<String> auteurs;
    private double prixDeVente;
    private double fraisDePort;

    @OneToMany(mappedBy = "livre")
    private List<Avis> avis;
    @ManyToMany
    @JoinTable(name= "CAT_LIV",
            joinColumns={@JoinColumn(name= "ID_LIV")})
    private Set<Categorie> categories;

    @ManyToMany
    @JoinTable(name= "COM_LIV",
            joinColumns={@JoinColumn(name= "ID_LIV")})
    private Set<Commande> commandes;

   @ManyToOne
   private Libraire libraire;



    // Getters et setters
}
