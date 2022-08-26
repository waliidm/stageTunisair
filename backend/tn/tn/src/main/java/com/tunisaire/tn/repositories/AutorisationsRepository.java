package com.tunisaire.tn.repositories;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorisationsRepository extends JpaRepository<AutorisationsEntity, Integer> {
    Iterable<AutorisationsEntity> findALLByMatricule(String mat);
    //Iterable<AutorisationsEntity> findResponsable(String mat);
}
