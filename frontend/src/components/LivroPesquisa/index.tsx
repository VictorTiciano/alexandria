import axios from "axios";
import { useEffect, useState } from "react";
import { Livro, LivroPage } from "../../types/livro";
import { BASE_URL } from "../../utils/request";
import "./styles.css"

type Props = {
    livro : Livro
}

function LivroPesquisa({livro}:Props) {

    const [pageNumber, setPageNumber] = useState(0);

    const [page, setPage] = useState<LivroPage>({
        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 12,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true

    });

    useEffect(() => {
        axios.get(`${BASE_URL}/livros?size=12&page=0`)
            .then(response => {
                const data = response.data as LivroPage;
                console.log(data);
                setPageNumber(data.number);
            })
    }, [])

    return (
        <div className="alexandria-livro-container">
            <div className="alexandria-livro-dados">
                <p>{livro.titulo}, {livro.autor}, {livro.editora}, {livro.ano_publicacao}
                </p>
            </div>
            <div className="alexandria-livro-buttons">
                <button className="btn btn-primary alexandria-btn">Reservar</button>
                <button className="btn btn-primary alexandria-btn">Solicitar emprestimo</button>
            </div>
        </div>
    );
}

export default LivroPesquisa;