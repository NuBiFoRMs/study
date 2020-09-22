import React, { Fragment } from "react";
import MyFunction from "./MyFunction";
import MyComponent from "./MyComponent";
import CountComponent from "./CountComponent";

const App = () => {
  return (
    <Fragment>
      <MyFunction name="test">value</MyFunction>
      <MyComponent name="test">value</MyComponent>
      <CountComponent></CountComponent>
    </Fragment>
  );
}

export default App;
