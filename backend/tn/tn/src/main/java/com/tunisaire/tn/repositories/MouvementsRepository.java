package com.tunisaire.tn.repositories;

import com.tunisaire.tn.entity.MouvementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouvementsRepository extends JpaRepository<MouvementsEntity, Integer> {

    Iterable<MouvementsEntity> findALLByMatricule(String mat);
}
