package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
    Contrat findOneById(Long contratid);
}
