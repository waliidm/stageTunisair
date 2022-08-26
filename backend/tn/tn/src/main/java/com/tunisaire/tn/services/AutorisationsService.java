package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.entity.UtilisateursEntity;

public interface AutorisationsService {
    Iterable<AutorisationsEntity> findMatricule(String matricule);
    Iterable<AutorisationsEntity> Responsable(String mat);
}
