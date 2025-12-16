/**
 * Exercise: Task List
 * 
 * 1. Create a Component 'TaskList'.
 * 2. Initialize a state variable 'tasks' with an array of strings.
 * 3. Render the list using .map().
 */

import React, { useState } from 'react';

function TaskList() {
    // Todo: Initialize State
    const [tasks, setTasks] = useState(["Learn React", "Build App"]);

    return (
        <ul>
            {/* Todo: Map over tasks and display <li> */}
            {tasks.map((task, index) => (
                <li key={index}>{task}</li>
            ))}
        </ul>
    );
}
