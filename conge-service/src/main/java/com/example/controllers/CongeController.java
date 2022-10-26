package com.example.controllers;

import com.example.entities.Conge;
import com.example.services.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class CongeController {

    @Autowired
    CongeService congeService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @PostMapping("/ajouterConge")
    public void ajouterConge(@RequestBody Conge conge) {
        congeService.addConge(conge);
    }
    @DeleteMapping(value="/deleteConge/{id}")
    public void supprimerConge(@PathVariable("id") int id) {

        congeService.deleteConge(id);
    }
    @GetMapping("/findConges")
    public List<Conge> afficherConge() {
        return congeService.findAllConge();
    }
    @GetMapping("/findCongeById/{id}")
    public Conge afficherConge(@PathVariable int id) {
        return congeService.findConge(id);
    }

    @PutMapping("/updateConge")
    public void updateEmployee(@RequestBody Conge Conge){

        congeService.addConge(Conge);
    }
}
