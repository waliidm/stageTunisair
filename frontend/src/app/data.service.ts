import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Utilisateurs } from './Models/Utilisateurs';
@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getInfoAutorisation(mat:String) {
    console.log("here");
    let headers = new HttpHeaders()
      .set('content-type', 'application/json')
      .set('Access-Control-Allow-Origin', '*')
      .set('Accept', '*/*');
    return this.http.get(`http://127.0.0.1:8082/autorisations/${mat}`, { 'headers': headers })
  }
  getInfoAutorisationResponsable(mat:String) {
    console.log("here");
    let headers = new HttpHeaders()
      .set('content-type', 'application/json')
      .set('Access-Control-Allow-Origin', '*')
      .set('Accept', '*/*');
    return this.http.get(`http://127.0.0.1:8082/autorisations/responsable/${mat}`, { 'headers': headers })
  }
getLoggedUser()
{
  return "1";
}
getLoggedRole()
{
  return "responsable";
}
getUser()
{
  const currentuser:Utilisateurs={'matricule':'1',
    'nomPrenom':'walid',
    'email':'mehrezw@mail.com',
    'role':'responsable',
    'matriculeResponsable':''
}
return currentuser;
};
getPointage(mat:String){
  let headers = new HttpHeaders()
      .set('content-type', 'application/json')
      .set('Access-Control-Allow-Origin', '*')
      .set('Accept', '*/*');
      headers.append('Origin','http://localhost:8082');
    
    let list: res[] = [];
    let req =this.http.get(`http://127.0.0.1:8082/badgeage/${mat}`, { 'headers': headers });
    req.forEach(element => {
      for (let key in element)
        {
      console.log(key)
    let temp = {title :element[key]["heureBadgeage"],date:element[key]["dateBadgeage"],backgroundColor: '#f44336',borderColor:'white'}
    console.log(temp)
    list.push(temp);
        }
});
return list;
}

getInfoDeplacement(mat:String) {
  console.log("here");
  let headers = new HttpHeaders()
    .set('content-type', 'application/json')
    .set('Access-Control-Allow-Origin', '*')
    .set('Accept', '*/*');
  return this.http.get(`http://127.0.0.1:8082/deplacements/${mat}`, { 'headers': headers })
}
getInfoDeplacementResponsable(mat:String) {
  console.log("here");
  let headers = new HttpHeaders()
    .set('content-type', 'application/json')
    .set('Access-Control-Allow-Origin', '*')
    .set('Accept', '*/*');
  return this.http.get(`http://127.0.0.1:8082/deplacements/responsable/${mat}`, { 'headers': headers })
}

getInfoMouvement(mat:String) {
  console.log("here");
  let headers = new HttpHeaders()
    .set('content-type', 'application/json')
    .set('Access-Control-Allow-Origin', '*')
    .set('Accept', '*/*');
  return this.http.get(`http://127.0.0.1:8082/mouvements/${mat}`, { 'headers': headers })
}
getInfoMouvementResponsable(mat:String) {
  console.log("here");
  let headers = new HttpHeaders()
    .set('content-type', 'application/json')
    .set('Access-Control-Allow-Origin', '*')
    .set('Accept', '*/*');
  return this.http.get(`http://127.0.0.1:8082/mouvements/responsable/${mat}`, { 'headers': headers })
}

}
interface res {
  title: any;
    date: any;

}