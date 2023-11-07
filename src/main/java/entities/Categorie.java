package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Categorie {

    @Id @GeneratedValue
    private int id;
    private String nom;
    @ManyToMany(mappedBy = "categories")
    private Set<Livre> livres;

    // Getters et setters
}
