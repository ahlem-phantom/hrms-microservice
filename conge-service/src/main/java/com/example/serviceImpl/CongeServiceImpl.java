package com.example.serviceImpl;

import com.example.entities.Conge;
import com.example.repositories.CongeRepository;
import com.example.services.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServiceImpl implements CongeService {

    @Autowired
    CongeRepository congeRepository;
    @Override
    public void addConge(Conge conge) {
        congeRepository.save(conge);
    }

    @Override
    public List<Conge> findAllConge() {
        return congeRepository.findAll();
    }

    @Override
    public void deleteConge(int id) {
        congeRepository.deleteById(id);
    }

    @Override
    public Conge findConge(int id) {
        return congeRepository.findOneById(id);
    }

    @Override
    public void updateConge(Conge conge) {
        congeRepository.save(conge);
    }
}
