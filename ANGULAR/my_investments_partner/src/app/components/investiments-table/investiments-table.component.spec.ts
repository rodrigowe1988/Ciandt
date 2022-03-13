import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InvestimentsTableComponent } from './investiments-table.component';

describe('InvestimentsTableComponent', () => {
  let component: InvestimentsTableComponent;
  let fixture: ComponentFixture<InvestimentsTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InvestimentsTableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InvestimentsTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
