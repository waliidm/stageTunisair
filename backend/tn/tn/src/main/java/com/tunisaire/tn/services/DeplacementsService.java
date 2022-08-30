package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.entity.DeplacementsEntity;

public interface DeplacementsService {

    Iterable<DeplacementsEntity> findMatricule(String matricule);
    Iterable<DeplacementsEntity> Responsable(String mat);
}
