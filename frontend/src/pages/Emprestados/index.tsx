import EmprestadoResult from "../../components/ResultEmprestado";
import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import "./styles.css"

function Emprestados(){
    return(
        <>
            <Navbar />
            <div className="alexandria-emprestados-container">
                <MenuLeft />
                <div className="alexandria-emprestados-content">
                    <h1>Livros emprestados</h1>
                    <EmprestadoResult/>
                </div>
            </div>
        </>
    );
}

export default Emprestados;