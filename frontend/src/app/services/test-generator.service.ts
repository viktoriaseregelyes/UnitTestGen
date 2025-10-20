import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface ValidationError {
  line: number;
  column: number;
  message: string;
  length: number;
}

// TODO ezt kellene a generate testbe berakni az observablebe és akkor úgy kellene visszaadni backendről a dolgokat, hogy bennevcan a coverage is
export interface Generated {
  test: string;
  coverage: number;
}

@Injectable({
  providedIn: 'root'
})
export class TestGeneratorService {

  private baseUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  generateTests(inputClass: string, testCases: string): Observable<Generated> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    const body = { inputClass, testCases };
    return this.http.post<Generated>(this.baseUrl + '/generate-tests', body, { headers });
  }

  validate(testCases: string): Observable<ValidationError[]> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.post<ValidationError[]>(this.baseUrl + '/validate', { testCases }, { headers });
  }
}