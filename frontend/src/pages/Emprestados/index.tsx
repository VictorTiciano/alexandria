import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import "./styles.css"
import { useEffect, useState } from "react";
import axios from "axios";
import { BASE_URL } from "utils/request";
import { LivroPage } from "types/livro";
import EmprestadoResult from "components/ResultEmprestado";

function Emprestados() {

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
            <div className="alexandria-emprestados-container">
                <MenuLeft />
                <div className="alexandria-emprestados-content">
                    <h1>Livros emprestados</h1>
                    {page.content.map(livro => (
                        <div key={livro.id}>
                            <EmprestadoResult livro={livro} />
                        </div>
                    )
                    )}
                </div>
            </div>
        </>
    );
}

export default Emprestados;