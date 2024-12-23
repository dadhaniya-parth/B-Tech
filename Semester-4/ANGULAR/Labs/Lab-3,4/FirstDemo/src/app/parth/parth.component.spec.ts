import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParthComponent } from './parth.component';

describe('ParthComponent', () => {
  let component: ParthComponent;
  let fixture: ComponentFixture<ParthComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ParthComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ParthComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
