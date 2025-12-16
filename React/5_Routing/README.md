# 🛣️ React Routing

Client-side routing allows navigation without refreshing the page.

## library: react-router-dom
- **BrowserRouter**: Wrapper for the app.
- **Routes & Route**: Define path-to-component mapping.
- **Link**: Navigation link (replacement for `<a>`).

## Setup
`npm install react-router-dom`

## Usage
```jsx
<Routes>
  <Route path="/" element={<Home />} />
  <Route path="/about" element={<About />} />
</Routes>
```
