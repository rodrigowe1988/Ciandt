import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItemDetailComponent } from './components/item-detail/item-detail.component';
import { TableService } from './services/table.service';

const routes: Routes = [
  {path: 'table', component: TableService },
  {path: 'table/:id', component: ItemDetailComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
