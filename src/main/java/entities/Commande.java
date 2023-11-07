package entities;
import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCommande;
    private String etatCommande;

    @ManyToOne
    private Client clientCommande;


    // Getters et setters
}
