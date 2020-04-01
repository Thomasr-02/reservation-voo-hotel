import React, { Component } from 'react'
import './Hospedagem.css'
import Axios from 'axios'
import { Link } from 'react-router-dom'
import GetSetIds from '../pages-statics/GetSetIds'
export default class Hospedagem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            hoteis: ['']
        }
    }


    componentDidMount() {
        Axios.get('http://localhost:8080/hotel')
            .then(res => {
                const hoteis = res.data;
                this.setState({ hoteis });



            }).catch((err) => {
                console.log(err)
            });

    }

    submitCompra(id) {
        GetSetIds.idHotel(id, 'set')
        console.log('VOO COMPRADO', GetSetIds.idVoo(0, 'get'));
    }


    render() {
        return (
            <div className="body-hospedagem">
                <div className="container-hosp">




                </div>
                <div className="group">
                    <p> Resultados encontrados:{this.state.hoteis.length}</p>
                    <div className="group-card">
                        {this.state.hoteis.map((hotel, index) => (
                            <div className="card-individual" key={index}>

                                <strong>{hotel.nome}</strong>
                                <p>{hotel.cidade}</p>
                                <p>{hotel.descricao}</p>


                                <strong>VALOR:</strong>
                                <p>{Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(hotel.preco)}</p>
                                <Link to="/hospedagem"><button className="btn btn-primary" id="buttoncompra" onClick={() => { this.submitCompra(hotel.id) }} type="button"     >Comprar </button>
                                </Link>
                            </div>
                        ))}
                    </div>

                </div>

            </div>
        )
    }
}