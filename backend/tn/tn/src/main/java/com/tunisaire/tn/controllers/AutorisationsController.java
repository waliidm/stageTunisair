package com.tunisaire.tn.controllers;

import com.tunisaire.tn.entity.AutorisationsEntity;
import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.services.AutorisationsService;
import com.tunisaire.tn.services.BadgeageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorisationsController {
    private AutorisationsService autorisationsService;

    @Autowired
    public  void setAutorisationsService(AutorisationsService autorisationsService)
    {
        this.autorisationsService =autorisationsService;
    }
    /**
     *
     *
     * @param
     * @return
     */

    @GetMapping(value = "/autorisations/{id}")
    public Iterable<AutorisationsEntity>  findMatricule(@PathVariable("id") String mat){


        return autorisationsService.findMatricule(mat);
    }
}
