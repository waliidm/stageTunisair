package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.UtilisateursEntity;
import com.tunisaire.tn.repositories.MouvementsRepository;
import com.tunisaire.tn.repositories.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateursServiceImpl implements UtilisateursService {

    @Autowired
    private UtilisateursRepository utilisateursRepository;

    @Override
    public Iterable<UtilisateursEntity> findALLByMatriculeResponsable(String mat) {
        return utilisateursRepository.findALLByMatriculeResponsable(mat);
    }
}
