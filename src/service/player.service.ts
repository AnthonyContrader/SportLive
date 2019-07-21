import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { PlayerDTO } from 'src/dto/playerdto';
import { HttpClient } from '@angular/common/http';
import { LoginDTO } from 'src/dto/logindto';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PlayerService extends AbstractService<PlayerDTO>{

  constructor(http: HttpClient) {
    super(http);
    this.type = 'user';
  }

  login(loginDTO: LoginDTO): Observable<PlayerDTO> {
    return this.http.post<any>('http://localhost:8080/' + this.type + '/login', loginDTO)
  }

}
