package com.tunisaire.tn.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "autorisations", schema = "tunisairdb", catalog = "")
public class AutorisationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_autorisations", nullable = false)
    private int idAutorisations;
    @Basic
    @Column(name = "matricule", nullable = false, length = 15)
    private String matricule;
    @Basic
    @Column(name = "beneficiaire_autorisations", nullable = false, length = 30)
    private String beneficiaireAutorisations;
    @Basic
    @Column(name = "affectation_autorisations", nullable = false, length = 50)
    private String affectationAutorisations;
    @Basic
    @Column(name = "date_sortie_autorisations", nullable = false)
    private Date dateSortieAutorisations;
    @Basic
    @Column(name = "heure_sortie_autorisations", nullable = false)
    private Time heureSortieAutorisations;
    @Basic
    @Column(name = "heure_retour_autorisations", nullable = false)
    private Time heureRetourAutorisations;

    public int getIdAutorisations() {
        return idAutorisations;
    }

    public void setIdAutorisations(int idAutorisations) {
        this.idAutorisations = idAutorisations;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getBeneficiaireAutorisations() {
        return beneficiaireAutorisations;
    }

    public void setBeneficiaireAutorisations(String beneficiaireAutorisations) {
        this.beneficiaireAutorisations = beneficiaireAutorisations;
    }

    public String getAffectationAutorisations() {
        return affectationAutorisations;
    }

    public void setAffectationAutorisations(String affectationAutorisations) {
        this.affectationAutorisations = affectationAutorisations;
    }

    public Date getDateSortieAutorisations() {
        return dateSortieAutorisations;
    }

    public void setDateSortieAutorisations(Date dateSortieAutorisations) {
        this.dateSortieAutorisations = dateSortieAutorisations;
    }

    public Time getHeureSortieAutorisations() {
        return heureSortieAutorisations;
    }

    public void setHeureSortieAutorisations(Time heureSortieAutorisations) {
        this.heureSortieAutorisations = heureSortieAutorisations;
    }

    public Time getHeureRetourAutorisations() {
        return heureRetourAutorisations;
    }

    public void setHeureRetourAutorisations(Time heureRetourAutorisations) {
        this.heureRetourAutorisations = heureRetourAutorisations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutorisationsEntity that = (AutorisationsEntity) o;
        return idAutorisations == that.idAutorisations && Objects.equals(matricule, that.matricule) && Objects.equals(beneficiaireAutorisations, that.beneficiaireAutorisations) && Objects.equals(affectationAutorisations, that.affectationAutorisations) && Objects.equals(dateSortieAutorisations, that.dateSortieAutorisations) && Objects.equals(heureSortieAutorisations, that.heureSortieAutorisations) && Objects.equals(heureRetourAutorisations, that.heureRetourAutorisations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutorisations, matricule, beneficiaireAutorisations, affectationAutorisations, dateSortieAutorisations, heureSortieAutorisations, heureRetourAutorisations);
    }
}
