import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListRenderWithInterfaceComponent } from './list-render-with-interface.component';

describe('ListRenderWithInterfaceComponent', () => {
  let component: ListRenderWithInterfaceComponent;
  let fixture: ComponentFixture<ListRenderWithInterfaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListRenderWithInterfaceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListRenderWithInterfaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
