# 🌍 Context API

Provides a way to pass data through the component tree without passing props down manually at every level ("Prop Drilling").

## Steps
1.  **Create Context**: `const MyContext = createContext()`.
2.  **Provider**: Wrap tree with `<MyContext.Provider value={...}>`.
3.  **Consumer**: Use `useContext(MyContext)` to access value.

## Use Case
Global state like Themes, User Authentication, Language methods.
