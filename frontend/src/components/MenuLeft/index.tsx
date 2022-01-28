import "./styles.css"
import { Link } from "react-router-dom";

function MenuLeft() {
    return (
        <div className="alexandria-menu-left">
            <ul className="alexandria-menu-left-elements">
                <li>
                <Link to={`emprestados/`}>
                    <a href="">Emprestimo</a>
                </Link>
                </li>
                <li>
                    <a href="/reservados">Reserva</a>
                </li>
                <li>
                    <a href="/bibliotecas">Biblioteca</a>
                </li>
                <li>
                    <a href="/">Livros</a>
                </li>
                <li>
                    <a href="/">Pesquisa</a>
                </li>
            </ul>
        </div>
    );
}

export default MenuLeft;