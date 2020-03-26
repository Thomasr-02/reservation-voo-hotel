import React, { Component } from 'react';
import './Home.css'

export default class Home extends Component{
    loading(){
        setInterval(()=>{
            
        },3000)
    }
    render(){
        return(
            <div className="body">    
                {this.loading()} 
                <h2>LOGADO</h2>
                
            </div>
           
        );
    }
}