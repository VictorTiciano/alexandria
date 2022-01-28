import { Cliente } from "types/cliente";
import { Livro } from "types/livro";
import LivroReservado from "../LivroReservado";
import "./styles.css"

type Props = {
    livro : Livro
}

function FrameReservados({livro}:Props){
    return(
        <>
        <LivroReservado livro={livro}/>
        </>
    );
}

export default FrameReservados;