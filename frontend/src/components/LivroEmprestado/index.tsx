import axios from "axios";
import { useEffect, useState } from "react";
import { Livro } from "types/livro";
import { BASE_URL } from "utils/request";
import "./styles.css"

type Props = {
    livro: Livro
}

function LivroEmprestado({livro}:Props) {

    const [livro1, setLivro] = useState<Livro>();

    useEffect(() => {
        axios.get(`${BASE_URL}/livros/${livro.id}`)
        .then(response => {
            setLivro(response.data)
        })
    })

    return (
        <div className="alexandria-livro-emprestado-container">
            <div className="alexandria-livro-dados">
                <p>{livro?.titulo}, {livro?.autor}, {livro?.editora}
                </p>
            </div>
            <div className="alexandria-livro-emprestado-buttons">
                <button className="btn btn-primary alexandria-btn">Renovar</button>
                <button className="btn btn-primary alexandria-btn">Devolver</button>
                <div className="alexandria-livro-emprestado-devolucao">
                    <p>Data de devolução</p>
                    <p>25/02/2022</p>
                </div>

            </div>
        </div>
    );
}

export default LivroEmprestado;