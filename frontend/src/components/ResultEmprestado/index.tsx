import LivroEmprestado from "../LivroEmprestado";
import "./styles.css"


function EmprestadoResult() {
    return (
        <div className="alexandria-emprestado-result-container">
            <LivroEmprestado />
            <LivroEmprestado />
            <LivroEmprestado />
        </div>
    );
}

export default EmprestadoResult;