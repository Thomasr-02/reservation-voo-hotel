import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import './Resumo.css'
import Axios from 'axios'
import GetSetIds from '../../pages-statics/GetSetIds';
import lottieOptions from './lottieOptions'
import Lottie from 'react-lottie'


export default class Resumo extends Component {
    constructor(props) {
        super(props);
        this.state = {
            vooComprado: [''],
            hotelComprado: [''],
            Comprador: [''],
            precoTotal: ''
        }
    }

    componentDidMount() {
        //listar hotel comprado
        var precoTot;
        var idHotel = GetSetIds.idHotel(0, 'get');
        Axios.get('http://localhost:8080/hotel/' + idHotel).then(res => {
            precoTot = (res.data.preco)
            this.setState({ hotelComprado: res.data })
            
        })
        var idVoo = GetSetIds.idVoo(0, 'get')
        Axios.get('http://localhost:8081/voos/' + idVoo).then(res => {
            var voo = res.data[0];
            console.log(voo)
            this.setState({ vooComprado: voo })
            precoTot = precoTot + res.data[0].preco
            console.log(precoTot)
            this.setState({ precoTotal: precoTot });
        })

        var idUsr = GetSetIds.idUser(0, 'get');
        Axios.get('http://localhost:8080/users/' + idUsr).then(res => {

            this.setState({ Comprador: res.data })

        })


    }



    render() {
        return (
            <div className="background-resumo-body">

                <div className="background-resumo">
                    <div className="lottie">
                        <Lottie options={lottieOptions}
                        />
                    </div>

                    <div className="card-resum">

                        <h1>Obrigado por comprar conosco, {this.state.Comprador.nome} !</h1>
                        <div className="info">
                            <div>


                                <h4><strong>Voo</strong></h4>
                                <p>Origem:{this.state.vooComprado.origem}</p>
                                <p>Destino:{this.state.vooComprado.destino}</p>
                                <p>Data ida:{this.state.vooComprado.data_ida}</p>
                                <p>Data volta:{this.state.vooComprado.data_volta}</p>
                                <p>Valor:{Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(this.state.vooComprado.preco)}</p>

                            </div>
                            <div>

                                <h4><strong>Hotel</strong></h4>
                                <p>Nome:{this.state.hotelComprado.nome}</p>
                                <p>Cidade:{this.state.hotelComprado.cidade}</p>


                                <p>Valor:{Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(this.state.hotelComprado.preco)}</p>
                            </div>
                            <div>
                                <h4><strong>Reserva</strong></h4>

                                <p>Valor total:{Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(this.state.precoTotal)}</p>

                            </div>

                        </div>
                        <Link to="/finalizar">
                            <button className="btn-floating" >  Confirmar</button>

                        </Link>
                    </div>

                </div >
            </div>
        )
    }
}