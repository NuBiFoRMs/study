import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

class App extends Component {

  state = {
    loading: false,
    ItemList: []
  }

  loadItem = () => {
    axios
      .get("/api/image/getImageList")
      .then(({ data }) => {
        this.setState({
          loading: true,
          ItemList: data
        });
      })
      .catch(e => {
        console.error(e);
        this.setState({
          loading: false
        });
      });
  };

  componentDidMount() {
    this.loadItem();
  }

  render() {
    console.log('App render');

    const { ItemList } = this.state;
    console.log(ItemList);
    
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

export default App;