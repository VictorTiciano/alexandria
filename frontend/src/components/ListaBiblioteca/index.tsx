import axios from "axios";
import { useEffect, useState } from "react";
import { Biblioteca } from "types/biblioteca";
import { Livro } from "types/livro";
import { BASE_URL } from "utils/request";
import "./styles.css"

type Props = {
    livro : Livro
}

function ListaBiblioteca({livro}:Props){

    const [livro1, setLivro] = useState<Biblioteca>();

    useEffect(() => {
        axios.get(`${BASE_URL}/bibliotecas/livros/${livro.biblioteca.id}`)
        .then(response => {
            setLivro(response.data)
        })
    })

    return(
        <div className="alexandria-livro-emprestado-container">
            <div className="alexandria-livro-dados">
                <p>{livro?.titulo}, {livro?.autor}, {livro?.editora}
                </p>
            </div>
        </div>
    );
}

export default ListaBiblioteca;