import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      rupees: "",
      euros: "",
      conversionRate: 0.011,
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { rupees, conversionRate } = this.state;
    const euros = (parseFloat(rupees) * conversionRate).toFixed(2);
    this.setState({ euros });
  };

  render() {
    return (
      <div style={{
        border: "2px solid #4CAF50",
        borderRadius: "10px",
        padding: "30px",
        margin: "30px auto",
        maxWidth: "400px",
        backgroundColor: "#f9fff9",
        boxShadow: "0px 4px 10px rgba(0,0,0,0.1)"
      }}>
        <h2 style={{ color: "#2e7d32" }}>💱 INR to Euro Converter</h2>
        <form onSubmit={this.handleSubmit}>
          <label style={{ fontWeight: "bold" }}>Enter Amount (INR): </label>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
            required
            style={{
              padding: "10px",
              margin: "10px 0",
              borderRadius: "5px",
              border: "1px solid #ccc",
              width: "100%",
              fontSize: "16px"
            }}
          />
          <button
            type="submit"
            style={{
              backgroundColor: "#2e7d32",
              color: "white",
              border: "none",
              padding: "10px 20px",
              borderRadius: "5px",
              fontSize: "16px",
              cursor: "pointer"
            }}
          >
            Convert
          </button>
        </form>
        {this.state.euros && (
          <h3 style={{ marginTop: "20px", color: "#00695c" }}>
            💶 Equivalent Euros: €{this.state.euros}
          </h3>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
