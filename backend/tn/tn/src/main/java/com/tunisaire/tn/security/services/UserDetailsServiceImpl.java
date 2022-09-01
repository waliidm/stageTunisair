package com.tunisaire.tn.security.services;

import com.tunisaire.tn.entity.UtilisateursEntity;
import com.tunisaire.tn.repositories.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UtilisateursRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UtilisateursEntity user = userRepository.findByMatricule(username);


    return UserDetailsImpl.build(user);
  }

}
