package com.tunisaire.tn.repositories;

import com.tunisaire.tn.entity.BadgeageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BadgeageRepository extends JpaRepository<BadgeageEntity, Integer> {

    Iterable<BadgeageEntity> findALLByMatricule(String mat);
}
