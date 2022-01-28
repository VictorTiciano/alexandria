import axios from "axios";
import ListaBiblioteca from "components/ListaBiblioteca";
import MenuLeft from "components/MenuLeft";
import Navbar from "components/Navbar";
import BibliotecaResult from "components/ResultBiblioteca";
import { useEffect, useState } from "react";
import { LivroPage } from "types/livro";
import { BASE_URL } from "utils/request";
import "./styles.css"


function Biblioteca() {

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
        axios.get(`${BASE_URL}/livros?size=12&page=${pageNumber}`)
            .then(response => {
                const data = response.data as LivroPage;
                setPage(data);
            })
    }, [pageNumber])

    return (
        <>
            <Navbar />
            <div className="alexandria-biblioteca-container">
                <MenuLeft />
                <div className="alexandria-biblioteca-contente">
                    <h1>Livros da biblioteca</h1>
                    {page.content.map(livro => (
                        <div key={livro.id}>
                            <BibliotecaResult livro={livro} />
                        </div>
                    )
                    )}
                </div>
            </div>
        </>

    );
}

export default Biblioteca;