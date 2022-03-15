import { ItemDetailComponent } from './components/item-detail/item-detail.component';
import { ListRenderWithServiceComponent } from './components/list-render-with-service/list-render-with-service.component';
import { TwoWayBindingComponent } from './components/two-way-binding/two-way-binding.component';
import { EmitterComponent } from './components/emitter/emitter.component';
import { EventosComponent } from './components/eventos/eventos.component';
import { IfRenderComponent } from './components/if-render/if-render.component';
import { DirectivesComponent } from './components/directives/directives.component';
import { ParentDataComponent } from './components/parent-data/parent-data.component';
import { ListRenderComponent } from './components/list-render/list-render.component';
import { FirstComponentComponent } from './components/first-component/first-component.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path: '', component: FirstComponentComponent},
  {path: 'list', component: ListRenderComponent},
  {path: 'parentdata', component: ParentDataComponent},
  {path: 'directives', component: DirectivesComponent},
  {path: 'ifrender', component: IfRenderComponent},
  {path: 'events', component: EventosComponent},
  {path: 'emitter', component: EmitterComponent},
  {path: 'listrender', component: ListRenderComponent},
  {path: 'twowaydata', component: TwoWayBindingComponent},
  {path: 'service', component: ListRenderWithServiceComponent},
  {path: 'service/:id', component: ItemDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
