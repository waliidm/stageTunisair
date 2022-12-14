import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { DataService } from 'app/data.service';
import { Utilisateurs } from 'app/Models/Utilisateurs';

@Component({
  selector: 'app-deplacements-list',
  templateUrl: './deplacements-list.component.html',
  styleUrls: ['./deplacements-list.component.css']
})
export class DeplacementsListComponent implements OnInit {
  displayedColumns: string[] = ['dateInterventionDeplacements', 'heureSortieDeplacements', 'heureRetourDeplacements'];
  displayedColumnsResp: string[] = ['matricule','beneficiaireDeplacements','affectationDeplacements', 'dateInterventionDeplacements', 'heureSortieDeplacements','heureRetourDeplacements'];
  dataSource: MatTableDataSource<any>;
  dataSourceResp: MatTableDataSource<any>;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;
  @ViewChild('paginatorResp') paginatorResp: MatPaginator;
  @ViewChild('sortResp') sortResp: MatSort;
  constructor(private dataService: DataService) { }
  curr:Utilisateurs;
  role:string;
  adminuser:string;
  ngOnInit() {
    this.role=localStorage.getItem('role');
    console.log(this.role);
    this.curr=this.dataService.getUser();
    this.dataService.getInfoDeplacement(this.dataService.getLoggedUser()).subscribe((res:any)=>{

     this.dataSource=new MatTableDataSource(res);;
     console.log(this.dataSource)
     this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
     });
     this.dataService.getInfoDeplacementResponsable(this.dataService.getLoggedUser()).subscribe((res:any)=>{

      this.dataSourceResp=new MatTableDataSource(res);;
      console.log(this.dataSourceResp)
      this.dataSourceResp.paginator = this.paginatorResp;
     this.dataSourceResp.sort = this.sortResp;
      });


     
  }
  ngAfterViewInit() {
    
  }


  applyFilter(event: Event) {
    
    const filterValue = (event.target as HTMLInputElement).value;
    console.log(filterValue)
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  applyFilterRes(event: Event) {
    
    const filterValue = (event.target as HTMLInputElement).value;
    console.log(filterValue)
    this.dataSourceResp.filter = filterValue.trim().toLowerCase();
  }
  findUser(){
    this.dataService.getInfoDeplacement(this.adminuser).subscribe((res:any)=>{

      this.dataSourceResp=new MatTableDataSource(res);
      console.log(this.dataSourceResp)
      this.dataSourceResp.paginator = this.paginatorResp;
     this.dataSourceResp.sort = this.sortResp;
      }, (err) => {
        this.dataSourceResp=new MatTableDataSource();
      }
      );
  }
}
