package com.tunisaire.tn.payload.response;

import java.util.List;

public class JwtResponse {
  private String token;
  private String type = "Bearer";

  private String username;

  private String matricule;

  private String role;

  public JwtResponse(String accessToken, String matricule,String role) {
    this.token = accessToken;

    this.matricule = matricule;

    this.role = role;
  }

  public String getAccessToken() {
    return token;
  }

  public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getUsername() {
    return matricule;
  }

  public void setUsername(String matricule) {
    this.matricule = matricule;
  }

  public String getMatricule() {
    return matricule;
  }

  public void setMatricule(String matricule) {
    this.matricule = matricule;
  }


}
