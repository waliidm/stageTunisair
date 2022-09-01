package com.tunisaire.tn.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tunisaire.tn.entity.UtilisateursEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private String matricule;

  private String role;

  @JsonIgnore
  private String mdp;



  public UserDetailsImpl(String matricule, String role, String mdp
      ) {
    this.matricule = matricule;
    this.role = role;
    this.mdp = mdp;
  }

  public static UserDetailsImpl build(UtilisateursEntity user) {

    return new UserDetailsImpl(
        user.getMatricule(),
        user.getRole(),
        user.getMdp()
            );
  }


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return null;
  }

  @Override
  public String getPassword() {
    return mdp;
  }

  @Override
  public String getUsername() {
    return matricule;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }


  public String getMatricule() {
    return matricule;
  }

  public String getRole() {
    return role;
  }

  public String getMdp() {
    return mdp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(matricule, user.matricule);
  }
}
