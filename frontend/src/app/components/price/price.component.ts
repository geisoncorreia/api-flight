import { Component, OnInit } from '@angular/core';
import { FlightService } from 'src/app/services/flight.service';
import { Flight } from 'src/app/flight';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-price',
  templateUrl: './price.component.html',
  styleUrls: ['./price.component.css']
})
export class PriceComponent implements OnInit {

  flightForm: FormGroup;
  flight: Flight;
  submitted = false;

  constructor(private flightService: FlightService, private formBuilder: FormBuilder) { }

  get f() { return this.flightForm.controls; }

  ngOnInit(): void {

    this.flightForm = this.formBuilder.group({
      from: ['', Validators.required],
      to: ['', Validators.required],
      curr: ['', Validators.required]
  });

    this.flight = new Flight;

  }

  onSubmit() {
    this.submitted = true;

    // stop here if form is invalid
    if (this.flightForm.invalid) {
        return;
    } else {
      this.getPrice();
    }

}

  getPrice(): void {
    this.flightService.findPrice(this.flightForm.value.from, this.flightForm.value.to, this.flightForm.value.curr)
      .subscribe(
        data => {
          this.flight.price = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  onReset() {
    this.submitted = false;
    this.flightForm.reset();
    this.flight = new Flight;
}

}
