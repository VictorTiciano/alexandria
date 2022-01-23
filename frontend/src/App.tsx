import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Emprestados from "./pages/Emprestados";
import Pesquisa from "./pages/Pesquisa";
import Reservados from "./pages/Reservados";


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Pesquisa />} />
        <Route path="/emprestados" element={<Emprestados />} />
        <Route path="/reservados" element={<Reservados />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
