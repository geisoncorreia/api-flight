import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8080/api/v1/flyFrom';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  constructor(private http: HttpClient) { }

  findPrice(from, to, curr): Observable<any> {
    return this.http.get(`${baseUrl}/${from}/to/${to}/curr/${curr}/price`);
  }
}
