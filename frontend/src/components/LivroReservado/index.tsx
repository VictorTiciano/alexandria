import "./styles.css"

function LivroReservado(){

    const livro = {
        id: 1,
        titulo: "Harry Potter e o Enigma da Fênix",
        autor: "J.K. Rowling",
        editora: "Editora Teste"
    }
    return(
        <div className="alexandria-livro-reservado-container">
            <div className="alexandria-livro-dados">
                <p>{livro.titulo}, { livro.autor}, { livro.editora}
                </p>
            </div>
            <div className="alexandria-livro-reservado-buttons">
                <button className="btn btn-primary alexandria-btn">Cancelar</button>
            </div>
        </div>
    );
}

export default LivroReservado;