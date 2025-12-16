/**
 * Exercise: Light Switch
 * 
 * 1. Create a component 'LightSwitch'.
 * 2. Variable 'isOn' (boolean state).
 * 3. Render a div that is Yellow if ON, Grey if OFF.
 * 4. A button to Toggle the state.
 */

import React, { useState } from 'react';

function LightSwitch() {
    const [isOn, setIsOn] = useState(false);

    const styles = {
        width: '100px',
        height: '100px',
        backgroundColor: isOn ? 'yellow' : 'grey',
        margin: '10px'
    };

    return (
        <div>
            <div style={styles}></div>
            <button onClick={() => setIsOn(!isOn)}>
                {isOn ? "Turn OFF" : "Turn ON"}
            </button>
        </div>
    );
}

export default LightSwitch;
