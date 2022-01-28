export type Emprestimo = {
    id: number,
    clientId: number,
    exemplarId: number,
    dataEmprestimo: Date;
    dataDevolucao: Date;
}

export type EmprestimoPage = {
    content: Emprestimo[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}