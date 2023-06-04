import React, { Component } from "react";
import logo from './logo.svg';
import './App.css';

class App extends Component {
  state = {
    daireler: []
  };

  async componentDidMount() {
    const response = await fetch('/v1/showdaires');
    const body = await response.json();
    this.setState({daireler: body});
  }

  render() {
    const {daireler} = this.state;
    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo"/>
            <div className="App-intro">
              <h2>Daireler</h2>
              {daireler.map(daire =>
                  <div key={daire.daireId}>
                    DaireId: {daire.daireId} Daire No: {daire.daireNo} Daire Kat No: {daire.katNo} Metrekare: {daire.metrekare}
                  </div>
              )}
            </div>
          </header>
        </div>
    );
  }
}

export default App;
