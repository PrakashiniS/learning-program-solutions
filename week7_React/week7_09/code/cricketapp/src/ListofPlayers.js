import React from 'react';
import './Players.css';

function ListofPlayers() {
  const players = [
    { name: "Sachin", score: 95 },
    { name: "Ganguly", score: 88 },
    { name: "Dravid", score: 65 },
    { name: "VVS Laxman", score: 45 },
    { name: "Sehwag", score: 72 },
    { name: "Zaheer", score: 67 },
    { name: "Harbhajan", score: 54 },
    { name: "Pathan", score: 75 },
    { name: "Kumble", score: 60 },
    { name: "Agarkar", score: 50 },
    { name: "Dinesh Karthik", score: 80 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div className="players-container">
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with Score Below 70</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
