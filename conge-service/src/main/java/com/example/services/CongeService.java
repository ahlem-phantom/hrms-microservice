package com.example.services;

import com.example.entities.Conge;

import java.util.List;

public interface CongeService {

    public void addConge(Conge conge);

    public List<Conge> findAllConge();

    public void deleteConge(int id);

    public Conge findConge(int id);

    public void updateConge(Conge conge) ;

}
