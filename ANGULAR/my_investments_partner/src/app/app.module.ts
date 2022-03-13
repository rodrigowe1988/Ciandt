import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InvestimentsTableComponent } from './components/investiments-table/investiments-table.component';
import { InvestimentsInformationComponent } from './components/investiments-information/investiments-information.component';

@NgModule({
  declarations: [
    AppComponent,
    InvestimentsTableComponent,
    InvestimentsInformationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
