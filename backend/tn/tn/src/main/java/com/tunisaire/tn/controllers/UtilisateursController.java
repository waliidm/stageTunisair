package com.tunisaire.tn.controllers;

import com.tunisaire.tn.entity.MouvementsEntity;
import com.tunisaire.tn.entity.UtilisateursEntity;
import com.tunisaire.tn.services.DeplacementsService;
import com.tunisaire.tn.services.MouvementsService;
import com.tunisaire.tn.services.UtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateursController {

    private UtilisateursService utilisateursService;

    @Autowired
    public  void setUtilisateursService(UtilisateursService utilisateursService)
    {
        this.utilisateursService =utilisateursService;
    }
    /**
     *
     *
     * @param
     * @return
     */
    @GetMapping(value = "/utilisateurs/{id}")
    public Iterable<UtilisateursEntity>  findALLByMatriculeResponsable(@PathVariable("id") String mat){


        return utilisateursService.findALLByMatriculeResponsable(mat);
    }
}
