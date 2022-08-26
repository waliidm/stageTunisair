package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.UtilisateursEntity;

public interface UtilisateursService {

    Iterable<UtilisateursEntity> findALLByMatriculeResponsable(String mat);
}
