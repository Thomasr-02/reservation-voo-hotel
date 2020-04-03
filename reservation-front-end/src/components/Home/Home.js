import React, { Component } from 'react';
import './Home.css'
import Axios from 'axios';
import { Link } from 'react-router-dom'
import GetSetIds from '../pages-statics/GetSetIds'
import PopUp from '../pages-statics/PopUp'


export default class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {
            voos: [''],
            origem: '',
            destino: '',
            data_ida: '',
            data_volta: ''
        }

    }
    componentDidMount() {

        Axios.get('http://localhost:8081/voos')
            .then(res => {
                var voos = res.data;
                PopUp.showMessage("success","Listagem de voos success!");
                this.setState({ voos });

            }).catch((err) => {
                PopUp.showMessage("error","Listagem de voos falhou ao consultar serviço!");
                console.log(err)
            });
        /* var Pessoa = GetSetIds.idUser(0,'get');
        console.log(Pessoa)
        Axios.get('http://localhost:8080/users/' + Pessoa)
            .then(res => {
                console.log(res.data)
            }).catch(err => { console.log(err) })
 */
    }

    escutadorDeInput = event => {

        const { name, value } = event.target;

        this.setState({
            [name]: value
        });

    }


    submitFormularioFilter = (e) => {
        e.preventDefault();
        if (e.target.name === 'origemAndDestino') {
            let origem = (this.state.origem)
            let destino = (this.state.destino)
            Axios.get('http://localhost:8081/voos/origem/' + origem + '/destino/' + destino).then(res => {
                var voos = res.data;
                this.setState({ voos })
            })

        }
        else {
            let data_volta = (this.state.data_volta)
            let data_ida = (this.state.data_ida)
            Axios.get('http://localhost:8081/voos/data_ida/' + data_ida + '/data_volta/' + data_volta).then(res => {
                var voos = res.data;
                this.setState({ voos })
            })

        }


    }
    submitCompra = (id) => {
        GetSetIds.idVoo(id, 'set');
    }
    render() {
        return (
            <div className="body-home">


                <div className="container">
                    <form className="form" >
                        <div className="input-group">
                            <div className="input-block">
                                <label htmlFor="origem">Origem</label>
                                <input
                                    name="origem"
                                    id="origem"
                                    onChange={this.escutadorDeInput}
                                    placeholder="ex: Joao pessoa"
                                    required
                                />
                            </div>

                            <div className="input-block">
                                <label htmlFor="destino">Destino</label>
                                <input
                                    id="destino"
                                    name="destino"
                                    placeholder="ex: Recife"

                                    onChange={this.escutadorDeInput}
                                    required
                                />
                            </div>
                        </div>


                        <div className="input-group">
                            <div className="input-block">

                                <label htmlFor="data_ida">Data ida :</label>
                                <input
                                    id="data_ida"
                                    name="data_ida"
                                    onChange={this.escutadorDeInput}
                                    type="date"
                                />
                            </div>

                            <div className="input-block">
                                <label htmlFor="data_volta">Data volta :</label>
                                <input type="date"
                                    id="data_volta"
                                    name="data_volta"
                                    onChange={this.escutadorDeInput}


                                />
                            </div>
                        </div>

                        <p>Filtrar por:</p>
                        <button className="btn btn-primary" name="origemAndDestino" onClick={this.submitFormularioFilter}>origem e destino</button>

                        <button className="btn btn-warning" name="data_idaAnddata_volta" onClick={this.submitFormularioFilter}> data</button>


                    </form>

                    <div className="container-next">
                        <h4>Deseja reservar apenas a hospedagem ?</h4>
                        <Link to="/hospedagem">
                            <button className="btn btn-primary" id="button-hosp" type="button">Clique aqui
                            </button>
                        </Link>
                    </div>

                    <p> Resultados encontrados:{this.state.voos.length}</p>
                </div>



                <div className="group">
                    <div className="group-card-voo">
                        {this.state.voos.map((voo, index) => (
                            <div className="card-individual" key={index}>

                                <strong>Nome empresa:</strong>
                                <p>{voo.nomeEmp}</p>
                                <strong>Origem:</strong>
                                <p>{voo.origem}</p>

                                <strong>Destino:</strong>
                                <p>{voo.destino}</p>

                                <strong>Data ida:</strong>
                                <p>{voo.data_ida}</p>

                                <strong>Data volta:</strong>
                                <p>{voo.data_volta}</p>

                                <strong>VALOR:</strong>
                                <p>{Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(voo.preco)}</p>{/* problema aqui, ele esta escutando a funcao a quantidade de  vezes
                                de listagem ou seja autoexecutando por causa da passagem do parametro () caso tirar funciona normal porem perdemos a passagem do parametro */}
                                
                                <Link to="/hospedagem"><button className="btn btn-primary" id="buttoncompra" onClick={() => { this.submitCompra(voo.id) }} type="button"     >Comprar </button>
                                </Link>
                            </div>
                        ))}
                    </div>

                </div>



            </div>

        );
    }
}