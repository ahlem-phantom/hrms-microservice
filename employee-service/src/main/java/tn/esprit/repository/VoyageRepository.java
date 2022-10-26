package tn.esprit.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Voyage;

import java.util.List;

@Repository
public interface VoyageRepository extends PagingAndSortingRepository<Voyage, Long> {
    Voyage findOneById(Long id);

    @Query(value ="select * from voyage where lower(pays) like lower(concat('%',:filter,'%'))" +
            " or " +
            " lower(etat) like lower(concat('%',:filter,'%'))" +
            " or " +
            " DATE_BILLET like lower(concat('%',:filter,'%'))" +
            "or " +
            "DATE_BILLET_RETOUR like lower(concat('%',:filter,'%')) or " +
            "lower(description) like lower(concat('%',:filter,'%'))" ,nativeQuery = true)
    List<Voyage> findAll(@Param("filter")String filter, Pageable pageable);

}
