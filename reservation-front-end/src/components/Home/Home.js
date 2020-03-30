import React, { Component } from 'react';
import './Home.css'
import Axios from 'axios';

export default class Home extends Component {
    constructor(props) {
        super(props);
        this.state = {
            voos: ['']
        }

    }
    componentDidMount() {
        Axios.get('http://localhost:8081/voos')
            .then(res => {
                console.log(res.data)
                const voos = res.data;
                this.setState({ voos });

            }).catch((err) => {
                console.log(err)
            });
    }


    escutadorDeInput = event => {
        const { name, value } = event.target;
        console.log(name)
        console.log(value)
        this.setState({
            [name]: value
        });
    }


    submitFormulario = () => {




    }
    render() {
        return (
            <div className="body">
               
               
               
                <div className="container">
                    <form className="form" >
                        <div className="input-group">
                            <div className="input-block">
                                <label htmlFor="origem">Origem</label>
                                <input
                                    name="origem"
                                    id="origem"
                                    onChange={this.escutadorDeInput}
                                    required
                                />
                            </div>

                            <div className="input-block">
                                <label htmlFor="destino">Destino</label>
                                <input
                                    id="destino"
                                    name="destino"
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
                                    type="date" required
                                />
                            </div>

                            <div className="input-block">
                                <label htmlFor="data_volta">Data volta :</label>
                                <input type="date"
                                    id="data_volta"
                                    name="data_volta"

                                    onChange={this.escutadorDeInput}
                                    required

                                />
                            </div>
                        </div>
                        <button onClick={this.submitFormulario} className="btn btn-primary" type="button">Pesquisar
                    </button>
                    </form>
                </div>

                <div className="group">
                    <p> Resultados encontrados:{this.state.voos.length}</p>
                    <div className="group-card">
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
                                <p>{Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(voo.preco)}</p>


                            </div>
                        ))}
                    </div>

                </div>



            </div>

        );
    }
}