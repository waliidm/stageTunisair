package com.tunisaire.tn.repositories;

import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.entity.DeplacementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeplacementsRepository  extends JpaRepository<DeplacementsEntity, Integer> {
    Iterable<DeplacementsEntity> findALLByMatricule(String mat);
}
