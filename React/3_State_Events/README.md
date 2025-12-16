# 💾 State & Events

## State
Data that changes over the lifecycle of a component.
- **`useState`**: The Hook to add state to functional components.
```jsx
const [count, setCount] = useState(0);
```

## Events
React events are named using camelCase, passing a function as the event handler.
- `onClick`
- `onChange`
- `onSubmit`

## Two-Way Binding
Connecting an input's value to state, and updating state on change.
```jsx
<input value={text} onChange={e => setText(e.target.value)} />
```
