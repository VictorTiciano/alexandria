import ListaBiblioteca from "components/ListaBiblioteca";
import { Livro } from "types/livro";

type Props = {
    livro : Livro
}

function BibliotecaResult({livro}:Props) {
    return (
        <div className="alexandria-emprestado-result-container">
           <ListaBiblioteca livro={livro}/>
        </div>
    );
}

export default BibliotecaResult;