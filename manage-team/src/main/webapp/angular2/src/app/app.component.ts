import {Component, OnInit} from "@angular/core";
import {FormControl, FormGroup} from "@angular/forms";
import {Headers, Http, RequestOptions, Response} from "@angular/http";
import {Observable} from "rxjs/Rx";
import "rxjs/add/operator/map";
import "rxjs/add/operator/catch";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  private baseUrl: string = 'http://localhost:8080/api';
  titleLbl = 'Employees';
  firsNameLbl = 'First Name';
  lastNameLbl = 'Last Name';
  emailAddressLbl = 'Email Address';
  phoneNumberLbl = 'Phone Number';
  addLbl = 'Add';
  searchLbl = 'Search';

  employeeAdd: FormGroup;
  employees: Employee[];

  request: EmployeesAdd;

  constructor(private http: Http) {
  }

  ngOnInit(): void {
    this.employeeAdd = new FormGroup({
      firstName: new FormControl(''),
      lastName: new FormControl(''),
      emailAddress: new FormControl(''),
      phoneNumber: new FormControl('')
    });
  }

  addEmployee({value}: { value: EmployeesAdd }) {
    console.log(value);
    this.request = new EmployeesAdd(value.firstName, value.lastName, value.emailAddress, value.phoneNumber);
    this.createEmployee(this.request);
    this.search();
  }


  search() {
    this.getAll().subscribe(employees => this.employees = employees, err => {
      console.log(err);
    });
  }

  doSomething(value: string) {
    console.log(value)
  }

  getAll(): Observable<Employee[]> {
    return this.http.get(this.baseUrl + '/persons').map(this.mapEmployee);
  }

  createEmployee(body: EmployeesAdd) {
    let bodyString = JSON.stringify(body);
    let headers = new Headers({'ContentType': 'application/json'});
    let options = new RequestOptions({headers: headers});
    this.http.post(this.baseUrl + "/persons", body, options).subscribe(res => console.log(res));
  }

  mapEmployee(response: Response): Employee[] {
    return response.json().content;
  }
}

export class EmployeesAdd {
  firstName: string;
  lastName: string;
  emailAddress: string;
  phoneNumber: string;

  constructor(firstName: string, lastName: string, emailAddress: string, phoneNumber: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;
  }
}

export interface Employee {
  id: number;
  firstName: string;
  lastName: string;
  emailAddress: string;
}
