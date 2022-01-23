import BarraPesquisa from "../BarraPesquisa";
import PesquisaResult from "../ResultPesquisa";
import "./styles.css"

function FramePesquisa(){
    return(
        <div>
            <BarraPesquisa />
            <PesquisaResult />
        </div>
    );
}

export default FramePesquisa;