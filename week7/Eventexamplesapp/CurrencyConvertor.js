import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [conversionType, setConversionType] = useState('Euro'); 

  const handleSubmit = (e) => {
    e.preventDefault();

    let result = 0;

    if (conversionType === 'Euro') {
      result = (amount / 1.25).toFixed(2); 
      alert(`Converting to Euro Amount is ${result}`);
    } 
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount: </label>
        <input
          type="number"
          required
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <br /><br />
        <label>Currency: </label>
        <select
          value={conversionType}
          onChange={(e) => setConversionType(e.target.value)}
        >
          <option value="Euro">Euro</option>
        </select>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
