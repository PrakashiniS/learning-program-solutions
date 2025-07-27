import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div style={styles.container}>
        <h2>Mall People Counter</h2>
        
        
        
        <button style={styles.button} onClick={this.updateEntry}>Login</button><p> <strong>{this.state.entryCount}&nbsp;People Entered!!!</strong></p>
        <button style={styles.button} onClick={this.updateExit}>Exit</button><p> <strong>{this.state.exitCount}&nbsp;People Exited!!!</strong></p>
      </div>
    );
  }
}

const styles = {
  container: {
    textAlign: 'center',
    marginTop: '50px',
    fontFamily: 'Arial'
  },
  button: {
    padding: '10px 20px',
    margin: '10px',
    fontSize: '16px',
    cursor: 'pointer'
  }
};

export default CountPeople;