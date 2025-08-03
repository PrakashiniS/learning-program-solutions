// src/App.js
import React from "react";
import "./App.css";

function App() {
  // Heading element using JSX
  const heading = <h1>Vacation Home Rentals</h1>;

  // Image attribute JSX
  const imageUrl =
    "https://images.unsplash.com/photo-1600585154340-be6161a56a0c?auto=format&fit=crop&w=1050&q=80";

  // Object with featured vacation home
  const featuredHome = {
    name: "Palm Breeze Villa",
    rent: 8000,
    location: "Goa, India",
  };

  // Array of vacation homes
  const vacationHomes = [
    {
      name: "Himalayan Retreat",
      rent: 6000,
      location: "Manali, India",
    },
    {
      name: "Desert Mirage",
      rent: 9500,
      location: "Jaisalmer, India",
    },
    {
      name: "Backwater Nest",
      rent: 7000,
      location: "Alleppey, India",
    },
    {
      name: "Palm Breeze Villa",
      rent: 8000,
      location: "Goa, India",
    },
  ];

  return (
    <div className="App" style={{ textAlign: "center", fontFamily: "Arial" }}>
      {heading}
      <img
        src={imageUrl}
        alt="Vacation home"
        style={{ width: "400px", marginBottom: "20px", borderRadius: "8px" }}
      />

      <h2>Featured Home:</h2>
      <p>
        <strong>Name:</strong> {featuredHome.name}
      </p>
      <p>
        <strong>Rent per Night:</strong>{" "}
        <span style={{ color: featuredHome.rent < 7500 ? "red" : "green" }}>
          ₹{featuredHome.rent}
        </span>
      </p>
      <p>
        <strong>Location:</strong> {featuredHome.location}
      </p>

      <h2>Available Vacation Homes:</h2>
      <div style={{ display: "flex", flexWrap: "wrap", justifyContent: "center" }}>
        {vacationHomes.map((home, index) => (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              padding: "20px",
              margin: "10px",
              width: "250px",
              borderRadius: "10px",
              boxShadow: "0 4px 6px rgba(0,0,0,0.1)",
              backgroundColor: "#f9f9f9",
            }}
          >
            <p><strong>Name:</strong> {home.name}</p>
            <p>
              <strong>Rent per Night:</strong>{" "}
              <span style={{ color: home.rent < 7500 ? "red" : "green" }}>
                ₹{home.rent}
              </span>
            </p>
            <p><strong>Location:</strong> {home.location}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
