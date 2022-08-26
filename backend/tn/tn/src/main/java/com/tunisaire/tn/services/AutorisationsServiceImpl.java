package com.tunisaire.tn.services;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.tunisaire.tn.controllers.AutorisationsController;
import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.UtilisateursEntity;
import com.tunisaire.tn.repositories.AutorisationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class AutorisationsServiceImpl implements AutorisationsService {

    @Autowired
    private AutorisationsRepository autorisationsRepository;
    @Autowired
    private UtilisateursServiceImpl utilisateursServiceImpl;

    @Override
    public Iterable<AutorisationsEntity> findMatricule(String mat) {
        return autorisationsRepository.findALLByMatricule(mat);
    }


    @Override
    public Iterable<AutorisationsEntity> Responsable(String mat) {
        Iterable<UtilisateursEntity> users=utilisateursServiceImpl.findALLByMatriculeResponsable(mat);

        List<AutorisationsEntity> iterable= new ArrayList<>();
        for (UtilisateursEntity next : users) {
            List<AutorisationsEntity> result = Lists.newArrayList(findMatricule(next.getMatricule()));
              iterable.addAll(result);
            // ...
        }
        return iterable;
    }


}
