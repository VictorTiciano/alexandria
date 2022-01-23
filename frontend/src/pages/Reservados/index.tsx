import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import ReservadoResult from "../../components/ResultReservado";
import "./styles.css"

function Reservados() {
    return (
        <>
            <Navbar />
            <div className="alexandria-reservados-container">
                <MenuLeft />
                <div className="alexandria-reservados-content">
                    <h1>Livros reservados</h1>
                    <ReservadoResult/>
                </div>
            </div>
        </>
    );
}

export default Reservados;