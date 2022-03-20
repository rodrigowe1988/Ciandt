import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListDetailComponent } from './components/list-detail/list-detail.component';
import { ListRenderComponent } from './components/list-render/list-render.component';
import { MyFirstComponentComponent } from './components/my-first-component/my-first-component.component';

const routes: Routes = [
  {path: '', component: MyFirstComponentComponent},
  {path: 'list', component: ListRenderComponent},
  {path: 'list/:id', component: ListDetailComponent}

];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
