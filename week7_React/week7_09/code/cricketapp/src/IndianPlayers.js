import React from 'react';
import './Players.css';

function IndianPlayers() {
  const oddTeam = ["Sachin", "Ganguly", "VVS Laxman", "Dravid", "Kumble"];
  const evenTeam = ["Zaheer", "Harbhajan", "Agarkar", "Sehwag", "Pathan"];

  const [firstOdd, secondOdd, ...restOdd] = oddTeam;
  const [firstEven, secondEven, ...restEven] = evenTeam;

  const T20players = ["Raina", "Yuvraj", "Dinesh Karthik"];
  const RanjiTrophy = ["Wasim Jaffer", "Amol Muzumdar"];

  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div className="players-container">
      <h2>Team Split (Using Destructuring)</h2>
      <p><strong>Odd Team Top Players:</strong> {firstOdd}, {secondOdd}</p>
      <p><strong>Even Team Top Players:</strong> {firstEven}, {secondEven}</p>

      <h3>All Players from T20 + Ranji Trophy (Using Merge)</h3>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
