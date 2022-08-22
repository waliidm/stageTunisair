package com.tunisaire.tn.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "deplacements", schema = "tunisairdb", catalog = "")
public class DeplacementsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_deplacements", nullable = false)
    private int idDeplacements;
    @Basic
    @Column(name = "matricule", nullable = false, length = 15)
    private String matricule;
    @Basic
    @Column(name = "beneficiaire_deplacements", nullable = false, length = 30)
    private String beneficiaireDeplacements;
    @Basic
    @Column(name = "affectation_deplacements", nullable = false, length = 50)
    private String affectationDeplacements;
    @Basic
    @Column(name = "date_intervention_deplacements", nullable = false)
    private Date dateInterventionDeplacements;
    @Basic
    @Column(name = "heure_sortie_deplacements", nullable = false)
    private Time heureSortieDeplacements;
    @Basic
    @Column(name = "heure_retour_deplacements", nullable = false)
    private Time heureRetourDeplacements;

    public int getIdDeplacements() {
        return idDeplacements;
    }

    public void setIdDeplacements(int idDeplacements) {
        this.idDeplacements = idDeplacements;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getBeneficiaireDeplacements() {
        return beneficiaireDeplacements;
    }

    public void setBeneficiaireDeplacements(String beneficiaireDeplacements) {
        this.beneficiaireDeplacements = beneficiaireDeplacements;
    }

    public String getAffectationDeplacements() {
        return affectationDeplacements;
    }

    public void setAffectationDeplacements(String affectationDeplacements) {
        this.affectationDeplacements = affectationDeplacements;
    }

    public Date getDateInterventionDeplacements() {
        return dateInterventionDeplacements;
    }

    public void setDateInterventionDeplacements(Date dateInterventionDeplacements) {
        this.dateInterventionDeplacements = dateInterventionDeplacements;
    }

    public Time getHeureSortieDeplacements() {
        return heureSortieDeplacements;
    }

    public void setHeureSortieDeplacements(Time heureSortieDeplacements) {
        this.heureSortieDeplacements = heureSortieDeplacements;
    }

    public Time getHeureRetourDeplacements() {
        return heureRetourDeplacements;
    }

    public void setHeureRetourDeplacements(Time heureRetourDeplacements) {
        this.heureRetourDeplacements = heureRetourDeplacements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeplacementsEntity that = (DeplacementsEntity) o;
        return idDeplacements == that.idDeplacements && Objects.equals(matricule, that.matricule) && Objects.equals(beneficiaireDeplacements, that.beneficiaireDeplacements) && Objects.equals(affectationDeplacements, that.affectationDeplacements) && Objects.equals(dateInterventionDeplacements, that.dateInterventionDeplacements) && Objects.equals(heureSortieDeplacements, that.heureSortieDeplacements) && Objects.equals(heureRetourDeplacements, that.heureRetourDeplacements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDeplacements, matricule, beneficiaireDeplacements, affectationDeplacements, dateInterventionDeplacements, heureSortieDeplacements, heureRetourDeplacements);
    }
}
