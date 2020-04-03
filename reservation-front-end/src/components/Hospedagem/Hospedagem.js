import React, { Component } from 'react'
import './Hospedagem.css'
import Axios from 'axios'
import { Link } from 'react-router-dom'
import GetSetIds from '../pages-statics/GetSetIds'
import PopUp from '../pages-statics/PopUp'


export default class Hospedagem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            hoteis: [''],
            cidade: ''
        }
    }


    componentDidMount() {
        Axios.get('http://localhost:8080/hotel')
            .then(res => {

                PopUp.showMessage("success", 'Listagem dos hoteis com sucesso!')
                const hoteis = res.data;
                
                this.setState({ hoteis });



            }).catch((err) => {
                console.log(err)
                PopUp.showMessage("error", 'Listagem dos hoteis falhou ao consultar serviço!!')

            });

    }


    escutadorDeInput = event => {

        const { name, value } = event.target;
        this.setState({
            [name]: value
        });

    }


    submitCompra(id) {
        GetSetIds.idHotel(id, 'set')
        console.log('VOO COMPRADO', GetSetIds.idVoo(0, 'get'));
    }

    submitFormulario() {

        Axios.get('http://localhost:8080/hotel?cidade=' + this.state.cidade).then(res => {
            console.log(res.data);
        }).catch(err => console.log(err));
    }


    render() {
        return (
            <div className="body-hospedagem">
                <div className="container-hosp">

                    <form className="form" >
                        <div className="input-group">
                            <div className="input-block">
                                <label htmlFor="cidade">Cidade</label>
                                <input
                                    name="cidade"
                                    id="cidade"
                                    onChange={this.escutadorDeInput}
                                    placeholder="ex: Recife"
                                    required
                                />
                            </div>

                        </div>

                        <button className="btn btn-primary" name="origemAndDestino" onClick={this.submitFormulario}>Pesquisar</button>


                    </form>


                    <p> Resultados encontrados:{this.state.hoteis.length}</p>
                </div>
                <div className="group">

                    {this.state.hoteis.map((hotel, index) => (

                        <div className="group-card" key={index}>

                            <div className="row">
                                <div className="col s12 m7">
                                    <div className="card">
                                        
                                            <img  className="card-image" src={hotel.url_imagem} />
                                        
                                            
                                        <div className="card-content">
                                            <span className="card-title">{hotel.cidade}</span>
                                            <p className="card-title">{hotel.nome}</p>
                                            <p>{hotel.descricao}</p>
                                            <p>Valor: {Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(hotel.preco)}</p>
                                        </div>
                                        <div className="card-action">
                                            <Link to="/finalizar"><button className="btn btn-primary" id="buttoncompra" onClick={() => { this.submitCompra(hotel.id) }} type="button"     >Comprar </button>
                                            </Link>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


                    ))}




                </div>

            </div>
        )
    }
}



