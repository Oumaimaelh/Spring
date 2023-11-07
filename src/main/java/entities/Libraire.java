package entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class Libraire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String motDePasse;
    private String nom;
    private String adresseCourrier;
    private String adresseMail;



    // Getters et setters
}
