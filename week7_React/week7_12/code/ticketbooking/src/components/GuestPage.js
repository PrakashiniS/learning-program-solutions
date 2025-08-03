import React from 'react';
import '../GuestPage.css';

const GuestPage = () => {
  const flightDetails = [
    { id: 1, flight: 'IndiGo 6E-123', from: 'Chennai', to: 'Delhi', time: '10:00 AM' },
    { id: 2, flight: 'Air India AI-404', from: 'Mumbai', to: 'Bangalore', time: '02:00 PM' },
  ];

  return (
    <div className="guest-container">
      <h2>✈️ Explore Available Flights</h2>
      <div className="flight-list">
        {flightDetails.map(f => (
          <div key={f.id} className="flight-card">
            <h4>{f.flight}</h4>
            <p>{f.from} ➡️ {f.to}</p>
            <p>Departure: {f.time}</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default GuestPage;
