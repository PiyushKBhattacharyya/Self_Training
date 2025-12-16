/**
 * Exercise: Submit Form
 * 
 * 1. Create a function 'onSubmit' in the component.
 * 2. Use HttpClient to POST data to the backend.
 * 3. Subscribe to the response.
 */

import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'app-form',
    template: `<button (click)="onSubmit()">Submit</button>`
})
export class FormComponent {
    constructor(private http: HttpClient) { }

    onSubmit() {
        const data = { name: "New User" };

        // Todo: Send POST
        this.http.post('http://localhost:3000/api/users', data)
            .subscribe({
                next: (res) => console.log("Success:", res),
                error: (err) => console.error("Error:", err)
            });
    }
}
