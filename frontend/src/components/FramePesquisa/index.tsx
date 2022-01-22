import BarraPesquisa from "../BarraPesquisa";
import PesquisaResult from "../PesquisaResult";
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