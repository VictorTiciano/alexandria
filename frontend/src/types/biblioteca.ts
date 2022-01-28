export type Biblioteca = {
    id: number,
    cnpj: string,
    nome: string,
    endereco: string
}

export type BibliotecaPage = {
    content: Biblioteca[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}