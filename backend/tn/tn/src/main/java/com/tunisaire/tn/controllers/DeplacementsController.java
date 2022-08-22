package com.tunisaire.tn.controllers;

import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.services.AutorisationsService;
import com.tunisaire.tn.services.DeplacementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeplacementsController {

    private DeplacementsService deplacementsService;

    @Autowired
    public  void setDeplacementsService(DeplacementsService deplacementsService)
    {
        this.deplacementsService =deplacementsService;
    }
    /**
     *
     *
     * @param
     * @return
     */
    @GetMapping(value = "/deplacements/{id}")
    public Iterable<DeplacementsEntity>  findMatricule(@PathVariable("id") String mat){


        return deplacementsService.findMatricule(mat);
    }
}
