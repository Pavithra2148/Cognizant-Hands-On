import React from "react";
import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        name="Pavithra"
        school="RMK College of Engineering and Technology"
        total={450}
        goal={5}
      />
    </div>
  );
}

export default App;