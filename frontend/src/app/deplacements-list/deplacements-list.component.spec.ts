import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeplacementsListComponent } from './deplacements-list.component';

describe('DeplacementsListComponent', () => {
  let component: DeplacementsListComponent;
  let fixture: ComponentFixture<DeplacementsListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeplacementsListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeplacementsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
