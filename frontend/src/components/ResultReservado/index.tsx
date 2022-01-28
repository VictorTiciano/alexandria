import FrameReservados from "components/FrameReservados";
import { Cliente } from "types/cliente";
import { Livro } from "types/livro";
import "./styles.css"

type Props = {
    livro : Livro
}

function ReservadoResult({livro}:Props){
    return(
        <div className="alexandria-reservado-result-container">
            <FrameReservados livro={livro} />
        </div>
    );
}

export default ReservadoResult;