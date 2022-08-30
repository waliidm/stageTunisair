package com.tunisaire.tn.controllers;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.entity.DeplacementsEntity;
import com.tunisaire.tn.services.AutorisationsService;
import com.tunisaire.tn.services.DeplacementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping(value = "/deplacements/responsable/{id}")
    public Iterable<DeplacementsEntity>  findALLByResponsable(@PathVariable("id") String mat){


        return deplacementsService.Responsable(mat);
    }
}
