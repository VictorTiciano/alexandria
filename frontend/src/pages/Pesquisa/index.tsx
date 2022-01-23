import FramePesquisa from "../../components/FramePesquisa";
import MenuLeft from "../../components/MenuLeft";
import Navbar from "../../components/Navbar";
import "./styles.css"

function Pesquisa() {
    return (
        <>
            <Navbar />
            <div className="alexandria-pesquisa-container">
                <MenuLeft />
                <div className="alexandria-pesquisa-content">
                    <h1>Pesquisa geral</h1>
                    <FramePesquisa/>
                </div>
            </div>
        </>
    );
}

export default Pesquisa;