export type Cliente = {
    id: number,
    nome: string,
    cpf: string,
    endereco: string,
    email: string
}

export type ClientePage = {
    content: Cliente[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}