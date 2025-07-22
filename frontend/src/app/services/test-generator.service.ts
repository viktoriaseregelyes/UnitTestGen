import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TestGeneratorService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  generateTests(inputClass: string): Observable<string> {
    const headers = new HttpHeaders({ 'Content-Type': 'text/plain' });
    return this.http.post(this.baseUrl + '/generate-tests', inputClass, { headers, responseType: 'text' });
  }
}