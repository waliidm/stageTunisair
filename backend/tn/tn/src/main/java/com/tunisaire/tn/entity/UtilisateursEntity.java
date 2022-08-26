package com.tunisaire.tn.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "utilisateurs", schema = "tunisairdb", catalog = "")
public class UtilisateursEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "matricule", nullable = false, length = 15)
    private String matricule;
    @Basic
    @Column(name = "mdp", nullable = false, length = 50)
    private String mdp;
    @Basic
    @Column(name = "nom_prenom", nullable = false, length = 50)
    private String nomPrenom;
    @Basic
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Basic
    @Column(name = "matricule_responsable", nullable = true, length = 15)
    private String matriculeResponsable;
    @Basic
    @Column(name = "role", nullable = false, length = 15)
    private String role;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(String nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatriculeResponsable() {
        return matriculeResponsable;
    }

    public void setMatriculeResponsable(String matriculeResponsable) {
        this.matriculeResponsable = matriculeResponsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilisateursEntity that = (UtilisateursEntity) o;
        return Objects.equals(matricule, that.matricule) && Objects.equals(mdp, that.mdp) && Objects.equals(nomPrenom, that.nomPrenom) && Objects.equals(email, that.email) && Objects.equals(matriculeResponsable, that.matriculeResponsable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, mdp, nomPrenom, email, matriculeResponsable);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
