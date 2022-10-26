package tn.esprit.controllers;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.entities.Voyage;
import tn.esprit.serviceImpl.VoyageServiceImpl;

import java.util.List;

@RestController
public class VoyageController {
    @Autowired
    VoyageServiceImpl voyageServiceImpl;
    @PostMapping("/ajouterVoyage")
    public void ajouterVoyage(@RequestBody Voyage voyage) {
        voyageServiceImpl.addVoyage(voyage);
    }
    @DeleteMapping(value="/deleteVoyage/{id}")
    public void supprimerVoyage(@PathVariable Long id) {
        voyageServiceImpl.deleteVoyage(id);
    }
    @GetMapping("/findVoyages")
    public List<Voyage> afficherVoyage(@RequestParam(value="filter",required = false)String filter,@RequestParam(value="page")int page,@RequestParam(value="limit")int limit) {
        if (StringUtils.isBlank(filter))
            filter="";
        return voyageServiceImpl.findAllVoyage(filter,page,limit);
    }
    @GetMapping("/findVoyageById/{id}")
    public Voyage afficherVoyage(@PathVariable Long id) {
        return voyageServiceImpl.findVoyage(id);
    }

    @PutMapping("/updateVoyage")
    public void updateVoyage(@RequestBody Voyage voyage){
        voyageServiceImpl.updateVoyage(voyage);
    }
}
