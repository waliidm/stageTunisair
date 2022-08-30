package com.tunisaire.tn.services;

import com.google.common.collect.Lists;
import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.entity.MouvementsEntity;
import com.tunisaire.tn.entity.UtilisateursEntity;
import com.tunisaire.tn.repositories.DeplacementsRepository;
import com.tunisaire.tn.repositories.MouvementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MouvementsServiceImpl implements MouvementsService{

    @Autowired
    private MouvementsRepository mouvementsRepository;
    @Autowired
    private UtilisateursServiceImpl utilisateursServiceImpl;
    @Override
    public Iterable<MouvementsEntity> findMatricule(String mat) {
        return mouvementsRepository.findALLByMatricule(mat);
    }

    @Override
    public Iterable<MouvementsEntity> Responsable(String mat) {
        Iterable<UtilisateursEntity> users=utilisateursServiceImpl.findALLByMatriculeResponsable(mat);

        List<MouvementsEntity> iterable= new ArrayList<>();
        for (UtilisateursEntity next : users) {
            List<MouvementsEntity> result = Lists.newArrayList(findMatricule(next.getMatricule()));
            iterable.addAll(result);
            // ...
        }
        return iterable;
    }
}
