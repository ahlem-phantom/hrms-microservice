package com.example.repositories;
import com.example.entities.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CongeRepository extends JpaRepository<Conge, Integer>{
    Conge findOneById(int id);

    
}
