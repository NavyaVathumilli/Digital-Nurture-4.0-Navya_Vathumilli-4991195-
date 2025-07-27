import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore Name={"Navya"}
        School={"Sri chaitanya Techno School"}
        total={85}
        goal={100} />
      
    </div>
  );
}

export default App;
