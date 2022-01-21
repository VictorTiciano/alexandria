import "./styles.css"

{/**Menu do lado esquerdo com opção de emprestimo, reserva e menu do usuario */ }
function MenuLeft() {
    return (
        <div className="alexandria-menu-left">
            <ul className="alexandria-menu-left-elements">
                <li>
                    <a href="">Emprestimo</a>
                </li>
                <li>
                    <a href="">Reserva</a>
                </li>
                <li>
                    <a href="">Livros</a>
                </li>
                <li>
                    <a href="">Outra coisa</a>
                </li>
            </ul>
        </div>
    );
}

export default MenuLeft;