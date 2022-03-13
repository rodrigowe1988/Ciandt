import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListRenderWithServiceComponent } from './list-render-with-service.component';

describe('ListRenderWithServiceComponent', () => {
  let component: ListRenderWithServiceComponent;
  let fixture: ComponentFixture<ListRenderWithServiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListRenderWithServiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListRenderWithServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
