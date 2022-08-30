package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.entity.MouvementsEntity;

public interface MouvementsService {
    Iterable<MouvementsEntity> findMatricule(String matricule);
    Iterable<MouvementsEntity> Responsable(String mat);
}
