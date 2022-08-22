package com.tunisaire.tn.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "mouvements", schema = "tunisairdb", catalog = "")
public class MouvementsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_mouvements", nullable = false)
    private int idMouvements;
    @Basic
    @Column(name = "matricule", nullable = false, length = 15)
    private String matricule;
    @Basic
    @Column(name = "beneficiaire_mouvements", nullable = false, length = 30)
    private String beneficiaireMouvements;
    @Basic
    @Column(name = "affectation_mouvements", nullable = false, length = 50)
    private String affectationMouvements;
    @Basic
    @Column(name = "nature_mouvements", nullable = false, length = 30)
    private String natureMouvements;
    @Basic
    @Column(name = "date_deb_mouvements", nullable = false)
    private Date dateDebMouvements;
    @Basic
    @Column(name = "date_fin_mouvements", nullable = false)
    private Date dateFinMouvements;

    public int getIdMouvements() {
        return idMouvements;
    }

    public void setIdMouvements(int idMouvements) {
        this.idMouvements = idMouvements;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getBeneficiaireMouvements() {
        return beneficiaireMouvements;
    }

    public void setBeneficiaireMouvements(String beneficiaireMouvements) {
        this.beneficiaireMouvements = beneficiaireMouvements;
    }

    public String getAffectationMouvements() {
        return affectationMouvements;
    }

    public void setAffectationMouvements(String affectationMouvements) {
        this.affectationMouvements = affectationMouvements;
    }

    public String getNatureMouvements() {
        return natureMouvements;
    }

    public void setNatureMouvements(String natureMouvements) {
        this.natureMouvements = natureMouvements;
    }

    public Date getDateDebMouvements() {
        return dateDebMouvements;
    }

    public void setDateDebMouvements(Date dateDebMouvements) {
        this.dateDebMouvements = dateDebMouvements;
    }

    public Date getDateFinMouvements() {
        return dateFinMouvements;
    }

    public void setDateFinMouvements(Date dateFinMouvements) {
        this.dateFinMouvements = dateFinMouvements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MouvementsEntity that = (MouvementsEntity) o;
        return idMouvements == that.idMouvements && Objects.equals(matricule, that.matricule) && Objects.equals(beneficiaireMouvements, that.beneficiaireMouvements) && Objects.equals(affectationMouvements, that.affectationMouvements) && Objects.equals(natureMouvements, that.natureMouvements) && Objects.equals(dateDebMouvements, that.dateDebMouvements) && Objects.equals(dateFinMouvements, that.dateFinMouvements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMouvements, matricule, beneficiaireMouvements, affectationMouvements, natureMouvements, dateDebMouvements, dateFinMouvements);
    }
}
