package com.example.controllers;
import java.util.List;

import com.example.entities.Contrat;
import com.example.services.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContratController {
    @Autowired
    ContratService contratService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @PostMapping("/ajouterContrat")
    public void ajouterContrat(@RequestBody Contrat contrat) {
        contratService.addContrat(contrat);
    }
    @DeleteMapping(value="/deleteContrat/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
    @GetMapping("/findContrats")
    public List<Contrat> afficherContrat() {
        return contratService.findAllContrat();
    }
    @GetMapping("/findContratById/{id}")
    public Contrat afficherContrat(@PathVariable Long id) {
        return contratService.findContrat(id);
    }

    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Contrat Contrat){
        contratService.addContrat(Contrat);
    }
}
