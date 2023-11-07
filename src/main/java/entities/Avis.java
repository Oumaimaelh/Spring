package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int note;
    private String commentaire;
    @ManyToOne
    private Client clientAvis;
    @ManyToOne
    private Livre livre;



    // Getters et setters
}
