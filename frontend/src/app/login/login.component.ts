import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'app/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  matricule: string ;
  mdp: string ;
  error:string;
  showErrorMessage=false
  constructor(private loginService:LoginService,private router: Router) { }

  ngOnInit(): void {
  }
signin(){
  this.showErrorMessage=false;
  console.log(this.matricule,this.mdp);
  this.loginService.signIn(this.matricule,this.mdp).subscribe((res:any)=>{

localStorage.setItem('token', res.accessToken);
localStorage.setItem('matricule', res.matricule);
localStorage.setItem('role', res.role);
this.router.navigateByUrl('/dashboard');

    },
    (err) => {
      this.showErrorMessage=true;
      if(err.error.message==='Bad credentials')
      {
        this.error="Mot de passe incorrect !"
      }
      else
      {
        this.error="L'utilisateur n'existe pas !"
      }
      
    
    });
}

}
