import React, { Component } from 'react';
import { Link } from 'react-router-dom'
import Axios from 'axios'
import './Login.css'


export default class Login extends Component {
    constructor(props) {
        super(props);

        this.state = {
            nome: ''
        }
    }

    Login = async (e) => {
        var nome = e.target.value;
        await this.setState({ nome })


    }
    Logar = () => {
        var nome = this.state.nome;
        console.log(nome)
        Axios.post('http://localhost:8080/users', { nome }).then((res) => {
            console.log(res)

        }
        ).catch(
            console.log("erro")
        )
    }

    render() {
        return (
            <div className="background">
                <div className="body-login">
                    <div className="login">
                        <div className="texto">
                            <h3>Agende já sua viagem!!</h3>
                            <h2>Digite seu nome !
                    </h2>
                            <input id="search" type="text" placeholder="Digite seu nome" onChange={this.Login} className="form-control" minLength='3' />
                            <Link to="/home"><button id="buttonSearch" onClick={this.Logar} type="button"     >Entrar </button>
                            </Link>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}