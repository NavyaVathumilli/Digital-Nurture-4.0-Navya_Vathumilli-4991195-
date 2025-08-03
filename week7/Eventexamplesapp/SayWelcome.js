function welcome(name) {
  alert(`Welcome`);
}

function SayWelcome() {
  return (
    <div>
      <button onClick={() => welcome(" ")}>Say Welcome</button>
    </div>
  );
}

export default SayWelcome;
