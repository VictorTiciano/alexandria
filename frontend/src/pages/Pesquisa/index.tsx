import BarraPesquisa from "../../components/BarraPesquisa";
import Meio from "../../components/Meio";
import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import "./styles.css"

function Pesquisa() {
    return (
        <>
            <Navbar />
            <div className="alexandria-pesquisa-container">
                <MenuLeft />
                <div className="alexandria-pesquisa-barra">
                    <h1>Pesquisa geral</h1>
                    <BarraPesquisa />
                    <Meio/>
                </div>
            </div>

        </>

    );
}

export default Pesquisa;