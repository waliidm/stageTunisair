import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'app/login.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  
    matricule: string ;
    mdp: string ;
    email:string;
    nom_prenom:string;
    role:string;
    error:string;
    showErrorMessage=false
    constructor(private loginService:LoginService,private router: Router) { }
  
    ngOnInit(): void {
    }
  signin(){
    this.showErrorMessage=false;
    
    if(this.matricule&& this.mdp && this.email && this.nom_prenom&& this.role)
    {
      console.log(this.matricule,this.mdp,this.email,this.nom_prenom,this.role);
      this.loginService.signup(this.matricule,this.mdp,this.nom_prenom,this.email,this.role).subscribe((res:any)=>{
        console.log(res)
        if(res.message==='Error: Username is already taken!')
              {
                this.showErrorMessage=true;
                this.error="L'utilisateur existe deja !"
             
              }
              else if(res.message==='User registered successfully!')
              {
                this.router.navigateByUrl('/login');
              }
              else{
                this.showErrorMessage=true;
                this.error=res.message
              }
        
            });
    }

  }

}
