import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { User } from 'src/app/model/user.model';
import { AppConstants } from 'src/app/constants/app.constants';

@Injectable({
  providedIn: 'root',
})
export class LoginService {
  constructor(private http: HttpClient) {}

  validateLoginDetails(user: User) {
    window.sessionStorage.setItem('userdetails', JSON.stringify(user));
    return this.http.get(environment.rooturl + AppConstants.LOGIN_API_URL);
  }
}
