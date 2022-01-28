import LivroEmprestado from "components/LivroEmprestado";
import { Livro } from "types/livro";
import "./styles.css"

type Props = {
    livro : Livro
}

function EmprestadoResult({livro}:Props) {
    return (
        <div className="alexandria-emprestado-result-container">
           <LivroEmprestado livro={livro}/>
        </div>
    );
}

export default EmprestadoResult;