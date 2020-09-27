import React, { Fragment } from "react";
import MyFunction from "./MyFunction";
import MyComponent from "./MyComponent";
import CountComponent from "./CountComponent";
import CountFunction from "./CountFunction";
import SayFunction from "./SayFunction";
import EventPratice from "./EventPratice";
import EventPraticeFnc from "./EventPraticeFnc";
import ValidationSample from "./ValidationSample";

const App = () => {
  return (
    <Fragment>
      <ValidationSample></ValidationSample>
      <EventPratice></EventPratice>
      <EventPraticeFnc></EventPraticeFnc>
      <MyFunction name="test">value</MyFunction>
      <MyComponent name="test">value</MyComponent>
      <CountComponent title="Component"></CountComponent>
      <CountFunction title="Function"></CountFunction>
      <SayFunction></SayFunction>
    </Fragment>
  );
};

export default App;

// import React, { Component } from "react";
// import ScrollBox from "./ScrollBox";

// class App extends Component {
//   render() {
//     return (
//       <div>
//         <ScrollBox ref={(ref) => (this.scrollBox = ref)}></ScrollBox>
//         <button
//           onClick={() => {
//             this.scrollBox.scrollToBottom();
//           }}
//         >맨 밑으로</button>
//       </div>
//     );
//   }
// }

// export default App;
