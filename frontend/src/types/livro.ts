export type Livro = {
    id: number,
    biblioteca_id: number,
    titulo: string,
    subtitulo: string,
    autor: string,
    isbn: string,
    assunto: string,
    n_edicao: number,
    editora: string,
    ano_publicacao: number,
    n_pagina: number,
    quantidade: number,
        biblioteca: {
            id: number,
            cnpj: string,
            nome: string,
            endereco: string
        }
}

export type LivroPage = {
    content: Livro[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}