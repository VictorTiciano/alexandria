import './styles.css'

function BarraPesquisa() {
    return (
        <div className="form-group alexandria-form-group">
            <input type="text" className="form-control" placeholder='Pesquise aqui' />
            <div className='alexandria-barra-pesquisa-buttons'>
                <button type="submit" className="btn btn-primary alexandria-btn">Pesquisar</button>
                <button className="btn btn-primary alexandria-btn">Limpar</button>
            </div>

        </div>
    );
}

export default BarraPesquisa;