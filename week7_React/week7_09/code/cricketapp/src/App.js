import React, { useState } from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const [flag, setFlag] = useState(false); 

  return (
    <div className="App" style={{ justifyContent: 'center', alignItems: 'center', padding: '20px' }}>
      <h1>Welcome to Cricket App</h1>
      <button onClick={() => setFlag(prev => !prev)}>
        Show {flag ? 'IndianPlayers' : 'ListofPlayers'}
      </button>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
