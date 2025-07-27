import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const { Name, School, total, goal } = props;

  const percentage = ((total / (goal * 100)) * 100).toFixed(1);

  return (
    <div className="container">
      <h2>Student Details</h2>
      <p><strong>Name:</strong> {Name}</p>
      <p><strong>School:</strong> {School}</p>
      <p><strong>Total:</strong> {total} Marks</p>
      <p><strong>Percentage:</strong> {percentage}%</p>
    </div>
  );
}

export default CalculateScore;