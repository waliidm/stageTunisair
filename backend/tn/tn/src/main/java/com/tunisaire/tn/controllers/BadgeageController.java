package com.tunisaire.tn.controllers;

import com.tunisaire.tn.entity.BadgeageEntity;
import com.tunisaire.tn.services.BadgeageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadgeageController {
    private BadgeageService badgeageService;

    @Autowired
    public  void setBadgeageService(BadgeageService badgeageService)
    {
        this.badgeageService =badgeageService;
    }
    /**
     *
     *
     * @param
     * @return
     */

    @GetMapping(value = "/badgeage/{id}")
    public Iterable<BadgeageEntity>  findMatricule(@PathVariable("id") String mat){


        return badgeageService.findMatricule(mat);
    }
}
