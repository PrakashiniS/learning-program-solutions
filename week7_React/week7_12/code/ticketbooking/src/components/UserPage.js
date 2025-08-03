import React from 'react';
import '../UserPage.css';

const UserPage = () => {
  return (
    <div className="user-container">
      <h2>🎉 Welcome Back!</h2>
      <p>You're now ready to book your tickets hassle-free.</p>
      <button className="book-btn" onClick={() => alert("✅ Booking Confirmed!")}>Book Ticket</button>
    </div>
  );
};

export default UserPage;
