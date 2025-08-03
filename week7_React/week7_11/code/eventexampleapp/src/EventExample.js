import React, { Component } from "react";

class EventExample extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  sayHello = () => {
    console.log("Hello from Bhuvana! 😊");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked!");
  };

  render() {
    return (
      <div style={{
        border: "2px solid #333",
        borderRadius: "10px",
        padding: "30px",
        margin: "30px auto",
        maxWidth: "400px",
        backgroundColor: "#f2f2f2",
        boxShadow: "0px 4px 10px rgba(0,0,0,0.1)"
      }}>
        <h2 style={{ color: "#333" }}>🎯 Interactive Counter</h2>
        <h3>Current Count: {this.state.counter}</h3>

        <button onClick={this.handleIncrement} style={buttonStyle}>➕ Increment</button>{" "}
        <button onClick={this.decrement} style={buttonStyle}>➖ Decrement</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("🎉 Welcome to the Event App!")} style={buttonStyle}>
          👋 Say Welcome
        </button>

        <br /><br />

        <button onClick={this.onPress} style={buttonStyle}>⚡ OnPress Alert</button>
      </div>
    );
  }
}

const buttonStyle = {
  backgroundColor: "#555",
  color: "#fff",
  border: "none",
  padding: "10px 16px",
  margin: "5px",
  borderRadius: "5px",
  fontSize: "14px",
  cursor: "pointer"
};

export default EventExample;
