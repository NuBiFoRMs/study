import React from "react";

const MyFunction = (props) => {
  const test = "testValue";
  return (
    <div>
      <h1>{props.name}</h1>
      <h2>{props.children}</h2>
      <h3>{test}</h3>
    </div>
  );
};

export default MyFunction;
