package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.repositories.BadgeageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BadgeageServiceImpl implements BadgeageService{

    @Autowired
    private BadgeageRepository badgeageRepository;

    @Override
    public Iterable<BadgeageEntity> findMatricule(String mat) {
        return badgeageRepository.findALLByMatricule(mat);
    }

}
