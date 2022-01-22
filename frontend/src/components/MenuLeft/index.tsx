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
                    <a href="/emprestados">Livros</a>
                </li>
                <li>
                    <a href="/emprestados">Outra coisa</a>
                </li>
            </ul>
        </div>
    );
}

export default MenuLeft;