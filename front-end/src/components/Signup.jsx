import React from "react";

function Signup() {
  return (
    <div className="flex justify-center items-center h-screen">
      <div className="flex flex-col w-fit">
        <h1>Log in here</h1>
        <input
          className="p-3 bg-neutral-300 text-xl font-medium"
          placeholder="username"
        />
        <input
          className="p-3 bg-neutral-300 text-xl font-medium"
          placeholder="password"
        />
        <button className="text-xs font-bold text-green-500">
          Forget password
        </button>
        <button className="text-2xl font-bold text-green-500">Signup</button>
      </div>
    </div>
  );
}

export default Signup;
