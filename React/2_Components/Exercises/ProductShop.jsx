/**
 * Exercise: Product Card
 * 
 * 1. Create a 'Product' component that accepts 'name', 'price', and 'category' as props.
 * 2. Render these details nicely.
 * 3. Create a Parent component that renders three Product components with different data.
 */

import React from 'react';

function Product({ name, price, category }) {
    return (
        <div className="product">
            {/* Todo: Display props */}
            <h3>{name}</h3>
            <p>Price: ${price}</p>
            <p>Category: {category}</p>
        </div>
    );
}

function Shop() {
    return (
        <div>
            <h1>My Shop</h1>
            {/* Todo: Render 3 Products */}
            <Product name="Laptop" price={1000} category="Electronics" />
        </div>
    );
}

export default Shop;
