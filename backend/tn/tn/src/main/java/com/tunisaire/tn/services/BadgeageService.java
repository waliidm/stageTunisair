package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.BadgeageEntity;

public interface BadgeageService {

    Iterable<BadgeageEntity> findMatricule(String matricule);


}
