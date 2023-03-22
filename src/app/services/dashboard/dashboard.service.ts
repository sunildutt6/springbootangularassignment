import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contact } from 'src/app/model/contact.model';
import { environment } from 'src/environments/environment';
import { AppConstants } from 'src/app/constants/app.constants';

@Injectable({
  providedIn: 'root',
})
export class DashboardService {
  constructor(private http: HttpClient) {}

  saveMessage(contact: Contact) {
    return this.http.post(
      environment.rooturl + AppConstants.CONTACT_API_URL,
      contact
    );
  }
}
