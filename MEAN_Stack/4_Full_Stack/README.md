# 🌐 Full Stack Integration (MEAN)

Connecting Angular (Frontend) with Node/Express (Backend).

## Architecture
- **Client**: Angular App (Port 4200).
- **Server**: Node/Express App (Port 3000).

## HttpClient
Angular's module to make HTTP requests.
```typescript
this.http.get('/api/data').subscribe(data => ...);
```

## RxJS (Observables)
Angular uses Observables to handle async data streams, unlike Promises used in standard JS/React.
