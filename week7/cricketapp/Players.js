const players = [
  { name: "Mr. Jack", score: 50 },
  { name: "Mr. Michael", score: 70 },
  { name: "Mr. John", score: 40 },
  { name: "Mr. Ann", score: 61 },
  { name: "Mr. Elisabeth", score: 61 },
  { name: "Mr. Sachin", score: 95 },
  { name: "Mr. Dhoni", score: 100 },
  { name: "Mr. Virat", score: 84 },
  { name: "Mr. Jadeja", score: 64 },
  { name: "Mr. Raina", score: 75 },
  { name: "Mr. Rohit", score: 80 }
];

const IndianTeam = ["First", "Second", "Third", "Fourth", "Fifth", "Sixth"];

const T20Players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

export { players, IndianTeam, IndianPlayers };
