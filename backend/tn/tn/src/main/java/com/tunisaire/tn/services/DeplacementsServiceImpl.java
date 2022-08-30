package com.tunisaire.tn.services;

import com.google.common.collect.Lists;
import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.entity.UtilisateursEntity;
import com.tunisaire.tn.repositories.BadgeageRepository;
import com.tunisaire.tn.repositories.DeplacementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeplacementsServiceImpl implements DeplacementsService{
    @Autowired
    private DeplacementsRepository deplacementsRepository;

    @Autowired
    private UtilisateursServiceImpl utilisateursServiceImpl;

    @Override
    public Iterable<DeplacementsEntity> findMatricule(String mat) {
        return deplacementsRepository.findALLByMatricule(mat);
    }

    @Override
    public Iterable<DeplacementsEntity> Responsable(String mat) {
        Iterable<UtilisateursEntity> users=utilisateursServiceImpl.findALLByMatriculeResponsable(mat);

        List<DeplacementsEntity> iterable= new ArrayList<>();
        for (UtilisateursEntity next : users) {
            List<DeplacementsEntity> result = Lists.newArrayList(findMatricule(next.getMatricule()));
            iterable.addAll(result);
            // ...
        }
        return iterable;
    }
}
