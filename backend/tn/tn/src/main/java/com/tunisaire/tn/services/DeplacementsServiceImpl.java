package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.repositories.BadgeageRepository;
import com.tunisaire.tn.repositories.DeplacementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeplacementsServiceImpl implements DeplacementsService{
    @Autowired
    private DeplacementsRepository deplacementsRepository;

    @Override
    public Iterable<DeplacementsEntity> findMatricule(String mat) {
        return deplacementsRepository.findALLByMatricule(mat);
    }
}
