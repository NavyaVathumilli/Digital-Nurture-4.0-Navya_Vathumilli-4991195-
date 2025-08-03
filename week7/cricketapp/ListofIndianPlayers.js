const ListofIndianPlayers = ({ IndianPlayers }) => (
  <ul>
    {IndianPlayers.map((player, i) => (
      <li key={i}>{player}</li>
    ))}
  </ul>
);
export default ListofIndianPlayers;
