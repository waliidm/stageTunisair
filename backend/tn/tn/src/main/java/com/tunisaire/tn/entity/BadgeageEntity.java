package com.tunisaire.tn.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "badgeage", schema = "tunisairdb", catalog = "")
public class BadgeageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_badgeage", nullable = false)
    private int idBadgeage;
    @Basic
    @Column(name = "matricule", nullable = false, length = 15)
    private String matricule;
    @Basic
    @Column(name = "jour_badgeage", nullable = false)
    private Date jourBadgeage;
    @Basic
    @Column(name = "mat_badgeage", nullable = false, length = 15)
    private String matBadgeage;
    @Basic
    @Column(name = "date_badgeage", nullable = false)
    private Date dateBadgeage;
    @Basic
    @Column(name = "heure_badgeage", nullable = false)
    private Time heureBadgeage;

    public int getIdBadgeage() {
        return idBadgeage;
    }

    public void setIdBadgeage(int idBadgeage) {
        this.idBadgeage = idBadgeage;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getJourBadgeage() {
        return jourBadgeage;
    }

    public void setJourBadgeage(Date jourBadgeage) {
        this.jourBadgeage = jourBadgeage;
    }

    public String getMatBadgeage() {
        return matBadgeage;
    }

    public void setMatBadgeage(String matBadgeage) {
        this.matBadgeage = matBadgeage;
    }

    public Date getDateBadgeage() {
        return dateBadgeage;
    }

    public void setDateBadgeage(Date dateBadgeage) {
        this.dateBadgeage = dateBadgeage;
    }

    public Time getHeureBadgeage() {
        return heureBadgeage;
    }

    public void setHeureBadgeage(Time heureBadgeage) {
        this.heureBadgeage = heureBadgeage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadgeageEntity that = (BadgeageEntity) o;
        return idBadgeage == that.idBadgeage && Objects.equals(matricule, that.matricule) && Objects.equals(jourBadgeage, that.jourBadgeage) && Objects.equals(matBadgeage, that.matBadgeage) && Objects.equals(dateBadgeage, that.dateBadgeage) && Objects.equals(heureBadgeage, that.heureBadgeage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBadgeage, matricule, jourBadgeage, matBadgeage, dateBadgeage, heureBadgeage);
    }
}
