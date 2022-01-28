import LivroEmprestado from "components/LivroEmprestado";
import { Livro } from "types/livro";
import "./styles.css"

type Props = {
    livro: Livro
}

function FrameEmprestados({livro}:Props){

    return(
        <div className="alexandria-livro-emprestado-container">
            <LivroEmprestado livro={livro} />
        </div>
    );
}

export default FrameEmprestados;