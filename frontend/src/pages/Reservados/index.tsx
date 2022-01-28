import axios from "axios";
import { useEffect, useState } from "react";
import { LivroPage } from "types/livro";
import { BASE_URL } from "utils/request";
import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import ReservadoResult from "../../components/ResultReservado";
import "./styles.css"

function Reservados() {
    const [pageNumber, setPageNumber] = useState (0);

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
    }, [pageNumber]);

    return (
        <>
            <Navbar />
            <div className="alexandria-reservados-container">
                <MenuLeft />
                <div className="alexandria-reservados-content">
                    <h1>Livros reservados</h1>
                    {page.content.map(livro => (
                        <div key={livro.id}>
                            <ReservadoResult livro={livro} />
                        </div>
                    )
                    )}
                </div>
            </div>
        </>
    );
}

export default Reservados;