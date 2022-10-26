package tn.esprit.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Voyage implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pays;
    private String Etat;
    @Temporal(TemporalType.DATE)
    Date dateBillet;
    @Temporal(TemporalType.DATE)
    Date dateBilletRetour;
    String description;

    @ManyToOne()
    Employee employee;
}
