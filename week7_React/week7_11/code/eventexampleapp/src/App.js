import React from "react";
import EventExample from "./EventExample";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  return (
    <div style={{ textAlign: "center", fontFamily: "Arial, sans-serif" }}>
      <h1 style={{ marginTop: "30px", color: "#1976d2" }}>⚛️ React Interaction Playground</h1>
      <EventExample />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
