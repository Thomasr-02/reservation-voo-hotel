import React, { Component } from 'react';
import { Link} from 'react-router-dom'

import './Login.css'

export default class Login extends Component{
    constructor(props) {
        super(props);

        this.state = {
            nome: ''
        }
    }
    
    render(){
        return(
            <div className="login">
                <h3>Agende já sua viagem!!</h3>
                <h2>Digite seu nome !
                </h2>
                <input id="search" type="text" className="form-control" required />
                <button > ENTRAR</button>  
            </div>
           
        );
    }
}