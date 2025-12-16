/**
 * Exercise: ToDo List
 * 
 * 1. Define a component 'TodoComponent'.
 * 2. Define an array of tasks.
 * 3. Use *ngFor in the template to list them.
 */

import { Component } from '@angular/core';

@Component({
    selector: 'app-todo',
    template: `
    <h2>Tasks</h2>
    <ul>
      <!-- Todo: Use *ngFor="let task of tasks" -->
      <li *ngFor="let task of tasks">
        {{ task }}
      </li>
    </ul>
  `
})
export class TodoComponent {
    tasks: string[] = ["Learn TypeScript", "Master Angular"];
}
