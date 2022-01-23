import LivroReservado from "../LivroReservado";
import "./styles.css"

function ReservadoResult(){
    return(
        <div className="alexandria-reservado-result-container">
            <LivroReservado/>
            <LivroReservado/>
            <LivroReservado/>
        </div>
    );
}

export default ReservadoResult;