import React, { useState } from 'react';

function ComplaintRegister() {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!name || !complaint) {
      alert("Please fill out both fields.");
      return;
    }

    // Generate a 6-digit random reference number
    const referenceId = Math.floor(100000 + Math.random() * 900000);

    alert(`Thanks ${name}
Your complaint is submitted
Transaction id : ${referenceId}`);

    // Clear form after submission
    setName('');
    setComplaint('');
  };

  return (
    <form onSubmit={handleSubmit} style={{ width: '400px', margin: 'auto' }}>
      <div style={{ marginBottom: '10px' }}>
        <label>Employee Name:</label><br />
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          style={{ width: '100%' }}
        />
      </div>
      <div style={{ marginBottom: '10px' }}>
        <label>Complaint:</label><br />
        <textarea
          rows="5"
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
          style={{ width: '100%' }}
        />
      </div>
      <button type="submit">Submit Complaint</button>
    </form>
  );
}

export default ComplaintRegister;