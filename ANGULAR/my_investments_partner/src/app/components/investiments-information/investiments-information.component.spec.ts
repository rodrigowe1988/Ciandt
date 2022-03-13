import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InvestimentsInformationComponent } from './investiments-information.component';

describe('InvestimentsInformationComponent', () => {
  let component: InvestimentsInformationComponent;
  let fixture: ComponentFixture<InvestimentsInformationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InvestimentsInformationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InvestimentsInformationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
