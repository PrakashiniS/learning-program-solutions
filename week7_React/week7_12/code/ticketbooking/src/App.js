import React, { Component } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';
import './App.css'; // New CSS file for styling

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  toggleLogin = () => {
    this.setState(prev => ({ isLoggedIn: !prev.isLoggedIn }));
  }

  render() {
    return (
      <div className="app-container">
        <div className="header">
          <h1>🎫 Smart Ticket Portal</h1>
          <button className="login-btn" onClick={this.toggleLogin}>
            {this.state.isLoggedIn ? 'Logout' : 'Login'}
          </button>
        </div>

        <div className="welcome-msg">
          {this.state.isLoggedIn ? (
            <p>Welcome back! You can now book and manage your tickets.</p>
          ) : (
            <p>Welcome, guest! Please log in to book your tickets.</p>
          )}
        </div>

        <div className="content-card">
          {this.state.isLoggedIn ? <UserPage /> : <GuestPage />}
        </div>
      </div>
    );
  }
}

export default App;
