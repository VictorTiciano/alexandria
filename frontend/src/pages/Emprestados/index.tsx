import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import PesquisaResult from "../../components/PesquisaResult";
import "./styles.css"

function Emprestados(){
    return(
        <>
            <Navbar />
            <div className="alexandria-emprestados-container">
                <MenuLeft />
                <div className="alexandria-emprestados-content">
                    <h1>Livros emprestados</h1>
                    <PesquisaResult/>
                </div>
            </div>
        </>
    );
}

export default Emprestados;