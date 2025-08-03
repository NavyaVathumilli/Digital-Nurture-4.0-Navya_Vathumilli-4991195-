import React from 'react';
import Counter from './components/Counter';
import SayWelcome from './components/SayWelcome';
import SyntheticEventBtn from './components/SyntheticEventBtn';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div style={{ padding: "20px" }}>
      <Counter />
      <SayWelcome />
      <SyntheticEventBtn />
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
