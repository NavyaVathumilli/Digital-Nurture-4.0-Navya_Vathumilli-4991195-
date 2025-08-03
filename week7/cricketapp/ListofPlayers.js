const ListofPlayers = ({ players }) => (
  <ul>
    {players.map((item, i) => (
      <li key={i}>Mr. {item.name} {item.score}</li>
    ))}
  </ul>
);
export default ListofPlayers;
