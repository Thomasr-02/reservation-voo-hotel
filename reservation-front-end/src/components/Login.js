import React, { Component } from 'react';

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
                <h2>Digite seu nome !
                </h2>
                <input id="search" type="text" className="form-control" required />
            </div>
           
        );
    }
}