import axios from "axios";
import BarraPesquisa from "components/BarraPesquisa";
import PesquisaResult from "components/ResultPesquisa";
import { useEffect, useState } from "react";
import { LivroPage } from "types/livro";
import { BASE_URL } from "utils/request";
import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import "./styles.css"

function Pesquisa() {
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
            <div className="alexandria-pesquisa-container">
                <MenuLeft />
                <div className="alexandria-pesquisa-content">
                    <h1>Pesquisa geral</h1>
                    <BarraPesquisa />
                    {page.content.map(livro => (
                        <div key={livro.id}>
                            <PesquisaResult livro={livro} />
                        </div>
                    )
                    )}
                </div>
            </div>
        </>
    );
}

export default Pesquisa;