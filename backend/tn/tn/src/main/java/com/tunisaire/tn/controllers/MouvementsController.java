package com.tunisaire.tn.controllers;

import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.entity.MouvementsEntity;
import com.tunisaire.tn.services.DeplacementsService;
import com.tunisaire.tn.services.MouvementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MouvementsController {
    private MouvementsService mouvementsService;

    @Autowired
    public  void setMouvementsService(MouvementsService mouvementsService)
    {
        this.mouvementsService =mouvementsService;
    }
    /**
     *
     *
     * @param
     * @return
     */
    @GetMapping(value = "/mouvements/{id}")
    public Iterable<MouvementsEntity>  findMatricule(@PathVariable("id") String mat){


        return mouvementsService.findMatricule(mat);
    }

    @GetMapping(value = "/mouvements/responsable/{id}")
    public Iterable<MouvementsEntity>  findALLByResponsable(@PathVariable("id") String mat){


        return mouvementsService.Responsable(mat);
    }
}
