import { Livro } from "types/livro";
import LivroPesquisa from "../LivroPesquisa";
import "./styles.css"

type Props = {
    livro : Livro
}

function PesquisaResult({livro}:Props){
    return(
        <div className="alexandria-pesquisa-result-container">
           <LivroPesquisa livro={livro} />
        </div>
    );
}

export default PesquisaResult;