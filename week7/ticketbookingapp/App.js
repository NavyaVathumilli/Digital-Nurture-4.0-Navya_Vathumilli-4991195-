import React, { useState } from 'react';

function LoginButton(props) {
  return <button onClick={props.onClick}>Login</button>;
}

function LogoutButton(props) {
  return <button onClick={props.onClick}>Logout</button>;
}

function UserGreeting() {
  return (
    <div>
      <h2>Welcome back</h2>
      <h3>Available Flights to Book:</h3>
      <ul>
        <li>Indigo - Hyderabad to Delhi - ₹3500 <button>Book Now</button></li>
        <li>Air India - Mumbai to Chennai - ₹4200 <button>Book Now</button></li>
        <li>Vistara - Bangalore to Kolkata - ₹3900 <button>Book Now</button></li>
      </ul>
    </div>
  );
}

function GuestGreeting() {
  return (
    <div>
      <h2>Please sign up.</h2>
      <p><i>Login to book tickets.</i></p>
    </div>
  );
}

function Greeting(props) {
  return props.isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div>
      <h1>✈️ Ticket Booking App</h1>
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}
    </div>
  );
}

export default App;
