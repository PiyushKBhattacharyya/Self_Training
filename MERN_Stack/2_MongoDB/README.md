# 🍃 MongoDB & Mongoose

## MongoDB
A NoSQL database that stores data in JSON-like documents.

## Mongoose
An Object Data Modeling (ODM) library for MongoDB and Node.js. It manages relationships between data, provides schema validation, and is used to translate between objects in code and the representation of those objects in MongoDB.

## Schema
Defines the structure of the document.
```javascript
const userSchema = new mongoose.Schema({
  name: String,
  email: String
});
```
