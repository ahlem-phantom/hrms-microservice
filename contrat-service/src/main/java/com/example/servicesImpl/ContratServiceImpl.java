package com.example.servicesImpl;

import com.example.entities.Contrat;
import com.example.repositories.ContratRepository;
import com.example.services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {
    @Autowired
    ContratRepository contratRepository;
    @Override
    public void addContrat(Contrat contrat) {
        contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> findAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat findContrat(Long contratid) {

        return contratRepository.findOneById(contratid);
    }

    @Override
    public void updateEmployee(Contrat contrat) {
        contratRepository.save(contrat);
    }
}
