package com.tunisaire.tn.repositories;

import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.entity.MouvementsEntity;
import com.tunisaire.tn.entity.UtilisateursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateursRepository extends JpaRepository<UtilisateursEntity, Integer> {

    Iterable<UtilisateursEntity> findALLByMatriculeResponsable(String mat);
    UtilisateursEntity findByMatricule(String mat);

    @Query("select (count(u) > 0) from UtilisateursEntity u where u.matricule = ?1")
    boolean existsByMatricule(String matricule);
}
