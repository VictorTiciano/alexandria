import "./styles.css"

function Livro() {
    return (
        <div className="alexandria-livro-container">
            <div className="alexandria-livro-content">
                <div className="alexandria-livro-dados">
                    <p>Administração do windows server 2008 R2 : server core / 2011 -  (Livros)
                    </p>
                </div>
                <div className="alexandria-livro-buttons">
                    <button className="btn btn-primary alexandria-btn">Reservar</button>
                    <button className="btn btn-primary alexandria-btn">Solicitar emprestimo</button>
                </div>
            </div>
        </div>
    );
}

export default Livro;