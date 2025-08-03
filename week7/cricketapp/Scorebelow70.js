const Scorebelow70 = ({ players }) => {
  const filtered = players.filter(item => item.score < 70);
  return (
    <ul>
      {filtered.map((item, i) => (
        <li key={i}>Mr. {item.name} {item.score}</li>
      ))}
    </ul>
  );
};
export default Scorebelow70;
