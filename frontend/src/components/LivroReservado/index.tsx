import axios from "axios";
import { useEffect, useState } from "react";
import { Cliente } from "types/cliente";
import { Livro } from "types/livro";
import { BASE_URL } from "utils/request";
import "./styles.css"

type Props = {
    livro: Livro
}

function LivroReservado({livro}:Props){
    
    const [livro1, setLivro] = useState<Livro>();

    useEffect(() => {
        axios.get(`${BASE_URL}/livros/${livro.id}`)
        .then(response => {
            setLivro(response.data)
        })
    })


    return(
        <div className="alexandria-livro-reservado-container">
            <div className="alexandria-livro-dados">
                <p>{livro.titulo}, { livro.autor}, { livro.editora}
                </p>
            </div>
            <div className="alexandria-livro-reservado-buttons">
                <button className="btn btn-primary alexandria-btn">Cancelar</button>
            </div>
        </div>
    );
}

export default LivroReservado;