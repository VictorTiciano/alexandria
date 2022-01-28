export type Exemplar = {
    id: number,
    livro_id: number,
    livro: {
        id: number,
        titulo: string,
        subtitulo: string,
        autor: string,
        editora: string,
        ano_publicacao: number,
        biblioteca: {
            id: number,
            nome: string,
            endereco: string
        }
    }
}

export type ExemplarPage = {
    content: Exemplar[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}