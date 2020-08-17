import { Component, OnInit } from '@angular/core';
import { FlightService } from 'src/app/services/flight.service';

@Component({
  selector: 'app-price',
  templateUrl: './price.component.html',
  styleUrls: ['./price.component.css']
})
export class PriceComponent implements OnInit {

  price: any;
  from: ''; 
  to: ''; 
  curr: '';

  constructor(private flightService: FlightService) { }

  ngOnInit(): void {
  
    

  }

  getPrice(): void {
    this.flightService.findPrice(this.from, this.to, this.curr)
      .subscribe(
        data => {
          this.price = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

}
