# 🧩 React Components

Components are the building blocks of React applications.

## Types
1.  **Functional Components**: JavaScript functions that return JSX. (Modern & Recommended).
2.  **Class Components**: ES6 classes extending `React.Component`. (Legacy).

## Props
"Properties". Read-only data passed from parent to child.
```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
<Welcome name="Alice" />
```
