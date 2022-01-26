import "./styles.css"

function LivroEmprestado() {

    const livro = {
        id: 1,
        titulo: "Harry Potter e a Pedra Filosofal",
        autor: "J.K. Rowling",
        editora: "Editora Teste",
        data_devolucao: "23/02/2022"
    }

    return (
        <div className="alexandria-livro-emprestado-container">
            <div className="alexandria-livro-dados">
                <p>{livro.titulo}, {livro.autor}, {livro.editora}
                </p>
            </div>
            <div className="alexandria-livro-emprestado-buttons">
                <button className="btn btn-primary alexandria-btn">Renovar</button>
                <div className="alexandria-livro-emprestado-devolucao">
                    <p>Data de devolução</p>
                    <p>{livro.data_devolucao}</p>
                </div>

            </div>
        </div>
    );
}

export default LivroEmprestado;