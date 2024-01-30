import { Component } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { RegisterService } from 'src/app/service/register.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {

  user = {
    fname: ' ',
    lname: ' ',
    email: ' ',
    contactNo:' ',
    gender: ' '
  }

  constructor(private registerService:RegisterService){}

  async Submit(){
    try{
      firstValueFrom(this.registerService.addUser(this.user));
      alert("succesfully register");
    }catch(err){
      alert("Invalid");
    }
  }

}
