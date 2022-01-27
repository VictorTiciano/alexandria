import LivroPesquisa from "../LivroPesquisa";
import "./styles.css"

function PesquisaResult(){

    const livro = {
        "id": 1,
        "biblioteca_id": 1,
        "titulo": "O último desejo",
        "subtitulo": "Ostatnie Zyczenie",
        "autor": "Andrzej Sapkowski",
        "isbn": "978-85-7827-958-5",
        "assunto": "Ficção medieval polonesa",
        "n_edicao": 1,
        "editora": "WMF Martins Fontes",
        "ano_publicacao": 1993,
        "n_pagina": 318,
        "quantidade": 4,
        "biblioteca": {
            "id": 1,
            "cnpj": "19287467301",
            "nome": "Biblioteca Acarau",
            "endereco": "Rua teste, 315 - centro"
        }
    }

    return(
        <div className="alexandria-pesquisa-result-container">
            <LivroPesquisa livro={livro}/>
        </div>
    );
}

export default PesquisaResult;