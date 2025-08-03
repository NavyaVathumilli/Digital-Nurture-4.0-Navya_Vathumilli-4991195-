export default function EvenPlayers({ players }) {
  const even = players.filter((_, index) => index % 2 !== 0);
  return (
    <ul>
      {even.map((name, i) => (
        <li key={i}>{name}</li>
      ))}
    </ul>
  );
}
