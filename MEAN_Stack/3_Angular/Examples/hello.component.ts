// Example: Hello Component (hello.component.ts)

import { Component } from '@angular/core';

@Component({
    selector: 'app-hello',
    template: `<h1>Hello, {{ name }}!</h1>`
})
export class HelloComponent {
    name: string = "Angular Developer";
}
