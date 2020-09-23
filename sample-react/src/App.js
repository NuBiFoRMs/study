import React, { Fragment } from "react";
import MyFunction from "./MyFunction";
import MyComponent from "./MyComponent";
import CountComponent from "./CountComponent";
import CountFunction from "./CountFunction";
import SayFunction from "./SayFunction";

const App = () => {
  return (
    <Fragment>
      <MyFunction name="test">value</MyFunction>
      <MyComponent name="test">value</MyComponent>
      <CountComponent title="Component"></CountComponent>
      <CountFunction title="Function"></CountFunction>
      <SayFunction></SayFunction>
    </Fragment>
  );
}

export default App;
