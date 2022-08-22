package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.repositories.AutorisationsRepository;
import com.tunisaire.tn.repositories.BadgeageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorisationsServiceImpl implements AutorisationsService {

    @Autowired
    private AutorisationsRepository autorisationsRepository;

    @Override
    public Iterable<AutorisationsEntity> findMatricule(String mat) {
        return autorisationsRepository.findALLByMatricule(mat);
    }
}
