import React, { Component } from "react";

class CountComponent extends Component {
  state = {
    number: 0,
  };
  render() {
    const { number } = this.state;
    return (
      <div>
        <h1>{this.props.title}</h1>
        <h2>{number}</h2>
        <button
          onClick={() => {
            this.setState({ number: number + 1 }, () => {
              console.log("callback setState");
            });
          }}
        >
          +1
        </button>
      </div>
    );
  }
}

export default CountComponent;
