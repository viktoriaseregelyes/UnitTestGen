import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TestGeneratorService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  generateTests(inputClass: string): Observable<{ generatedTests: string }> {
    const headers = new HttpHeaders({ 'Content-Type': 'text/plain' });
    return this.http.post<{ generatedTests: string }>(this.baseUrl, inputClass);
  }
}