package com.example.entities;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long iduser;
   @Temporal(TemporalType.DATE)
    private Date signingdate;
   @Temporal(TemporalType.DATE)
    private Date Enddate;
    private String Description;
}
