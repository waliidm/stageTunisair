import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MouvementsListComponent } from './mouvements-list.component';

describe('MouvementsListComponent', () => {
  let component: MouvementsListComponent;
  let fixture: ComponentFixture<MouvementsListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MouvementsListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MouvementsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
