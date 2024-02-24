import React from "react";
function User() {
  return (
    <div className=" flex bg-neutral-100 text-neutral-800 ">

      <div className="fixed flex flex-col justify-between top-0 left-0 h-screen w-1/5 bg-neutral-200">

        <div className="flex bg-neutral-400 p-5 items-center">
          <img className="w-16 rounded-full" src="https://i.pinimg.com/564x/97/e9/37/97e93701392a53ae68113b48e1a8956b.jpg" alt="avatar" />
          <div className="pl-5">
            <p className="text-lg font-bold">Om Prakash Mallik</p>
            <p className="text-medium font-semibold">@omprakashmallik91</p>
          </div>
        </div>

        <div className="p-5  flex flex-col">
          <a className="bg-neutral-300 p-2 mb-1 text-xl font-semibold rounded">career</a>
          <a className="bg-neutral-300 p-2 mb-1 text-xl font-semibold rounded">Party</a>
          <a className="bg-neutral-300 p-2 mb-1 text-xl font-semibold rounded">Travel</a>
          <a className="bg-neutral-300 p-2 mb-1 text-xl font-semibold rounded">Movies</a>

        </div>

        <a className=" text-red-600 pb-10 text-center text-lg font-black cursor-pointer">Log Out</a>

      </div>

      <div className="w-4/5 ml-auto p-10">
        <h1 className="mb-5 text-4xl font-semibold">Category Heading</h1>
        <div>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
          <p>Tasks</p>
        </div>
      </div>

    </div>
  );
}

export default User;
