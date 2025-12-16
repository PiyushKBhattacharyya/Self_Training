# ⚡ Effects & Lifecycle

## useEffect
The Hook for handling side effects (API calls, subscriptions, manual DOM updates).

## Dependency Array
- `[]`: Runs once on mount (like `componentDidMount`).
- `[prop]`: Runs on mount and when `prop` changes.
- `undefined` (no array): Runs on every render.

## Cleanup
Return a function from `useEffect` to clean up (like `componentWillUnmount`).
```jsx
useEffect(() => {
  const timer = setInterval(...)
  return () => clearInterval(timer);
}, []);
```
