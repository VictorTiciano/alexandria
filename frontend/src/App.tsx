import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Navbar from "./components/Navbar";
import Emprestados from "./pages/Emprestados";
import Pesquisa from "./pages/Pesquisa";


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Pesquisa />} />
        <Route path="/emprestados" element={<Emprestados />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
