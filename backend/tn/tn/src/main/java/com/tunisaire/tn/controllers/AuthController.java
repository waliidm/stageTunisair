package com.tunisaire.tn.controllers;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


import com.tunisaire.tn.payload.request.SignupRequest;
import com.tunisaire.tn.repositories.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tunisaire.tn.payload.request.LoginRequest;
//import com.tunisaire.tn.payload.request.SignupRequest;
import com.tunisaire.tn.payload.response.JwtResponse;
import com.tunisaire.tn.payload.response.MessageResponse;

import com.tunisaire.tn.security.jwt.JwtUtils;
import com.tunisaire.tn.security.services.UserDetailsImpl;

import com.tunisaire.tn.entity.UtilisateursEntity;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UtilisateursRepository userRepository;

    @Autowired
    PasswordEncoder encoder;
    @Autowired
    JwtUtils jwtUtils;
    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getMatricule(),
                userDetails.getRole()
                ));
    }
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser( @RequestBody SignupRequest signUpRequest) {
        if (userRepository.existsByMatricule(signUpRequest.getMatricule())) {
            return ResponseEntity.ok(new MessageResponse("Error: Username is already taken!"));
        }

        // Create new user's account
        UtilisateursEntity user = new UtilisateursEntity(signUpRequest.getMatricule(),
                encoder.encode(signUpRequest.getPassword( )),
                signUpRequest.getNom_prenom(),
                signUpRequest.getEmail(),
                signUpRequest.getRole());
        System.out.println(user
        );
        userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}