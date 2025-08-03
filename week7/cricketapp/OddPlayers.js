export default function OddPlayers({ players }) {
  const odd = players.filter((_, index) => index % 2 === 0);
  return (
    <ul>
      {odd.map((name, i) => (
        <li key={i}>{name}</li>
      ))}
    </ul>
  );
}
