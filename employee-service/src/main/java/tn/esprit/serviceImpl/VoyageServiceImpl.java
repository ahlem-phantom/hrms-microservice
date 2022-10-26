package tn.esprit.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tn.esprit.entities.Voyage;
import tn.esprit.repository.VoyageRepository;
import tn.esprit.service.VoyageService;

import java.util.List;
@Service
public class VoyageServiceImpl implements VoyageService {
   @Autowired
    VoyageRepository voyageRepository;
    @Override
    public void addVoyage(Voyage voyage) {
        voyageRepository.save(voyage);
    }

    @Override
    public List<Voyage> findAllVoyage(String filter,int page,int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        return voyageRepository.findAll(filter,pageable);
    }

    @Override
    public void deleteVoyage(Long id) {
         voyageRepository.deleteById(id);
    }

    @Override
    public Voyage findVoyage(Long id) {
        return voyageRepository.findOneById(id);
    }

    @Override
    public void updateVoyage(Voyage voyage) {
        voyageRepository.save(voyage);
    }
}
