package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String motDePasse;
    private String nom;
    private String adresseCourrier;
    private String adresseMail;
    @OneToMany( mappedBy = "clientAvis")
    private List<Avis> avis;

    @OneToMany( mappedBy = "clientCommande")
    private List<Commande> commandes;

    // Getters et setters
}
