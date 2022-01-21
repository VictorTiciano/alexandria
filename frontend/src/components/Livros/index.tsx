import Livro from "../Livro";
import "./styles.css"


function Livros(){
    return(
        <div className="alexandria-livros-container">
            <Livro/>
            <Livro/>
            <Livro/>
            <Livro/>
        </div>
    );
}

export default Livros;