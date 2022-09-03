package com.tunisaire.tn.payload.request;

import java.util.Set;



public class SignupRequest {

  private String matricule;

  private String nom_prenom;
  private String email;

  private String role;


  private String password;

    public String getNom_prenom() {
        return nom_prenom;
    }

    public void setNom_prenom(String nom_prenom) {
        this.nom_prenom = nom_prenom;
    }

    public String getMatricule() {
    return matricule;
  }

  public void setMatricule(String matricule) {
    this.matricule = matricule;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

    public SignupRequest(String matricule, String nom_prenom, String email, String role, String password) {
        this.matricule = matricule;
        this.nom_prenom = nom_prenom;
        this.email = email;
        this.role = role;
        this.password = password;
    }

  @Override
  public String toString() {
    return "SignupRequest{" +
            "matricule='" + matricule + '\'' +
            ", nom_prenom='" + nom_prenom + '\'' +
            ", email='" + email + '\'' +
            ", role='" + role + '\'' +
            ", password='" + password + '\'' +
            '}';
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
