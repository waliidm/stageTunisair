package com.tunisaire.tn.services;

import com.tunisaire.tn.entity.MouvementsEntity;
import com.tunisaire.tn.repositories.DeplacementsRepository;
import com.tunisaire.tn.repositories.MouvementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MouvementsServiceImpl implements MouvementsService{

    @Autowired
    private MouvementsRepository mouvementsRepository;

    @Override
    public Iterable<MouvementsEntity> findMatricule(String mat) {
        return mouvementsRepository.findALLByMatricule(mat);
    }
}
