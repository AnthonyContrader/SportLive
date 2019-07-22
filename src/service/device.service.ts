import { Injectable } from '@angular/core';
import { AbstractService } from './abstractservice';
import { DeviceDTO } from 'src/dto/devicedto';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
  })
  export class DeviceService extends AbstractService<DeviceDTO>{

    constructor(http: HttpClient) {
        super(http);
        this.type = 'device';
      }
  }