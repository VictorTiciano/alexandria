import "./styles.css"
import 'bootstrap/dist/css/bootstrap.css';

function Navbar() {
    return (
        <header >
            <nav className="container">
                <div className="alexandria-nav-content">
                    <h1>Alexandria</h1>
                    <div className="alexandria-menu-content">
                        <a href="https://github.com/fernanddo-s/alexandria" target="_blank" rel="noreferrer noopener" className="alexandria-menu-element">
                            <p>Sobre</p>
                        </a>
                        <a href="/" className="alexandria-menu-element">
                            <p>Livros</p>
                        </a>
                        <a href="/" className="alexandria-menu-element">
                            <p>Login</p>
                        </a>
                    </div>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;