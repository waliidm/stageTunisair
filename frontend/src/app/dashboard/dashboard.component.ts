import { Component, OnInit } from '@angular/core';
import * as Chartist from 'chartist';
import { HttpClient } from '@angular/common/http';
import { CalendarOptions } from '@fullcalendar/angular';
import { DataService } from 'app/data.service';
import { ThisReceiver } from '@angular/compiler';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  Events: any[] = [];
  adminuser:string='';
  role:string;
  showErrorMessage=false;
  error:string;
  calendarOptions: CalendarOptions = {
    headerToolbar: {
      left: 'prev,next today',
      center: 'title',
      right: 'dayGridMonth,timeGridWeek,timeGridDay,listWeek'
    },
    initialView: 'dayGridMonth',
    weekends: true,
    editable: true,
    selectable: true,
    selectMirror: true,
    dayMaxEvents: true,
    eventColor: '#f44336'
  };
  constructor(private dataService: DataService) { }
  ngOnInit(): void {
    this.role=localStorage.getItem('role');
    console.log(this.role);
    setTimeout(() => {
        
          this.Events=this.dataService.getPointage(this.dataService.getLoggedUser());
          
    }, 500);
    setTimeout(() => {
      this.calendarOptions = {
        initialView: 'dayGridMonth',
        
        events: this.Events,
      };
    }, 500);
    
  }
  findUser(){
    this.showErrorMessage=false;
    
    if (this.adminuser==='')
    {
      this.ngOnInit()  ; }
    else{
    setTimeout(() => {
  
      this.Events=this.dataService.getPointage(this.adminuser);
     
      
}, 500);
setTimeout(() => {
  this.calendarOptions = {
    initialView: 'dayGridMonth',
    
    events: this.Events,
  };
}, 1100);
setTimeout(() => {
  if (this.Events.length===0)
{
  this.error="utilisateur n'existe pas!";
  this.showErrorMessage=true;
}
else{
  this.error=this.adminuser;
  this.showErrorMessage=true;
  
}
 
  
}, 1000);

  }
}
}
