package com.example.services;

import com.example.entities.Contrat;

import java.util.List;

public interface ContratService {
    public void addContrat(Contrat contrat);

    public List<Contrat> findAllContrat();

    public void deleteContrat(Long id);

    public Contrat findContrat(Long contratid);

    public void updateEmployee(Contrat contrat) ;

}
