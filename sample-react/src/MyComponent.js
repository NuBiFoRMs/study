import React, { Component } from "react";

class MyCompnent extends Component {
  test1 = "test1Value";
  render() {
    const test2 = "test2Value";
    return (
      <div>
        <h1>{this.props.name}</h1>
        <h2>{this.props.children}</h2>
        <h3>{this.test1}</h3>
        <h3>{test2}</h3>
      </div>
    );
  }
}

export default MyCompnent;
