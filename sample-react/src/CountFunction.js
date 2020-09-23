import React, { useState } from "react";

const CountFunction = (props) => {
  const [number, setNumber] = useState(0);
  return (
    <div>
      <h1>{props.title}</h1>
      <h2>{number}</h2>
      <button
        onClick={() => {
          setNumber(number + 1);
        }}
      >
        +1
      </button>
    </div>
  );
};

export default CountFunction;
