import React, { useState } from "react";

const EventPraticeFnc = () => {
  const [form, setForm] = useState({ username: "", message: "" });

  const { username, message } = form;

  const handleChange = (e) => {
    const nextForm = { ...form, [e.target.name]: e.target.value };
    setForm(nextForm);
  };

  const handleClick = () => {
    alert(username + ": " + message);
    setForm({ username: "", message: "" });
  };

  const handleKeyPress = (e) => {
    if (e.key === "Enter") {
      handleClick();
    }
  };

  return (
    <div>
      <h1>이벤트 연습</h1>
      <input
        type="text"
        name="username"
        placeholder="사용자명"
        value={username}
        onChange={handleChange}
      ></input>
      <input
        type="text"
        name="message"
        placeholder="아무거나 입력해보세요"
        value={message}
        onChange={handleChange}
        onKeyPress={handleKeyPress}
      ></input>
      <button onClick={handleClick}>확인</button>
    </div>
  );
};

export default EventPraticeFnc;
