import "./styles.css"

function LivroReservado(){
    return(
        <div className="alexandria-livro-reservado-container">
            <div className="alexandria-livro-dados">
                <p>Administração do windows server 2008 R2 : server core / 2011 -  (Livros)
                </p>
            </div>
            <div className="alexandria-livro-reservado-buttons">
                <button className="btn btn-primary alexandria-btn">Cancelar</button>
            </div>
        </div>
    );
}

export default LivroReservado;