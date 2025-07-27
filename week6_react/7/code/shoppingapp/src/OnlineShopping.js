import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor() {
    super();
    this.cartItems = [
      new Cart("Laptop", 55000),
      new Cart("Smartphone", 25000),
      new Cart("Headphones", 3000),
      new Cart("Smartwatch", 7000),
      new Cart("Keyboard", 1500)
    ];
  }

  render() {
    return (
      <div>
        <h2>Shopping Cart</h2>
        <table border="1" cellPadding="10" style={{ margin: '20px auto', textAlign: 'left' }}>
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price (₹)</th>
            </tr>
          </thead>
          <tbody>
            {this.cartItems.map((item, index) => (
              <tr key={index}>
                <td>{item.itemname}</td>
                <td>{item.price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;