import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './page/home/home.component';
import { AboutUSComponent } from './page/about-us/about-us.component';
import { ContactUsComponent } from './page/contact-us/contact-us.component';
import { RegistrationComponent } from './page/registration/registration.component';

const routes: Routes = [
  {path:"",component:HomeComponent},
  {path:"aboutUs",component:AboutUSComponent},
  {path:"contactUs",component:ContactUsComponent},
  {path:'register',component:RegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
