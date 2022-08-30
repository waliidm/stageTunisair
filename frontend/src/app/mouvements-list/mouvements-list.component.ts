import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { DataService } from 'app/data.service';
import { Utilisateurs } from 'app/Models/Utilisateurs';
@Component({
  selector: 'app-mouvements-list',
  templateUrl: './mouvements-list.component.html',
  styleUrls: ['./mouvements-list.component.css']
})
export class MouvementsListComponent implements OnInit {
  displayedColumns: string[] = ['natureMouvements', 'dateDebMouvements', 'dateFinMouvements'];
  displayedColumnsResp: string[] = ['matricule','beneficiaireMouvements','affectationMouvements', 'natureMouvements', 'dateDebMouvements','dateFinMouvements'];
  dataSource: MatTableDataSource<any>;
  dataSourceResp: MatTableDataSource<any>;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;
  @ViewChild('paginatorResp') paginatorResp: MatPaginator;
  @ViewChild('sortResp') sortResp: MatSort;
  constructor(private dataService: DataService) { }
  curr:Utilisateurs;
  ngOnInit() {
    this.curr=this.dataService.getUser();
    this.dataService.getInfoMouvement(this.dataService.getLoggedUser()).subscribe((res:any)=>{

     this.dataSource=new MatTableDataSource(res);;
     console.log(this.dataSource)
     this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
     });
     this.dataService.getInfoMouvementResponsable(this.dataService.getLoggedUser()).subscribe((res:any)=>{

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

}