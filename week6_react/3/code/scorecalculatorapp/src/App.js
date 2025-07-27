import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Prakashini"
        School="Bharathi school"
        total={434}
        goal={5} 
      />
    </div>
  );
}

export default App;