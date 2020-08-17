import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PriceComponent } from './components/price/price.component';


const routes: Routes = [
  { path: 'price', component: PriceComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
