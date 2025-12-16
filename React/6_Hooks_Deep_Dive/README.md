# 🎣 Hooks Deep Dive

## useRef
- Access DOM elements directly.
- Persist values between renders without causing re-renders.

## useMemo
- Memoize expensive calculations so they only re-run when dependencies change.

## Custom Hooks
- Extract reusable state logic into a function starting with `use`.
```jsx
function useToggle(initial = false) {
  const [state, setState] = useState(initial);
  const toggle = () => setState(prev => !prev);
  return [state, toggle];
}
```
