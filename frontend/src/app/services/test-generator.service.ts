import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface ValidationError {
  line: number;
  column: number;
  message: string;
  length: number;
}

@Injectable({
  providedIn: 'root'
})
export class TestGeneratorService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  generateTests(inputClass: string, testCases: string): Observable<string> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    const body = { inputClass, testCases };
    return this.http.post(this.baseUrl + '/generate-tests', body, { headers, responseType: 'text' });
  }

  validate(testCases: string): Observable<ValidationError[]> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.post<ValidationError[]>(this.baseUrl + '/validate', { testCases }, { headers });
  }
}