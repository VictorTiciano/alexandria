import "./styles.css"

function LivroEmprestado() {
    return (
        <div className="alexandria-livro-emprestado-container">
            <div className="alexandria-livro-dados">
                <p>Administração do windows server 2008 R2 : server core / 2011 -  (Livros)
                </p>
            </div>
            <div className="alexandria-livro-emprestado-buttons">
                <button className="btn btn-primary alexandria-btn">Renovar</button>
                <div className="alexandria-livro-emprestado-devolucao">
                    <p>Data de devolução</p>
                    <p>25/02/2022</p>
                </div>

            </div>
        </div>
    );
}

export default LivroEmprestado;