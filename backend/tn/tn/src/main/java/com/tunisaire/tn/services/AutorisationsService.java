package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;

public interface AutorisationsService {
    Iterable<AutorisationsEntity> findMatricule(String matricule);
}
