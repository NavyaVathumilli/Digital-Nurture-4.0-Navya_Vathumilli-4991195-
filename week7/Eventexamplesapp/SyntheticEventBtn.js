function SyntheticEventBtn() {
  const handleClick = (e) => {
    alert(`I was ${e.type}`);
  };

  return <button onClick={handleClick}>OnPress</button>;
}

export default SyntheticEventBtn;
