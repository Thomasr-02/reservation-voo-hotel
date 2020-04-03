import React, { Component } from 'react'
import Lottie from 'react-lottie'
import lottieOptions from './lottieOptions '
import './Finalizar.css'
import Axios from 'axios'
import GetSetIds from '../pages-statics/GetSetIds';

export default class extends Component{
    componentDidMount(){
        Axios.post('http://localhost:8080/compras',{ id_hotel:GetSetIds.idHotel(0, 'get'),id_voo:GetSetIds.idVoo(0, 'get'),id_user:GetSetIds.idUser(0, 'get')})
    }

    render(){
        return(
            <div className="body-finalizar">
         
            <div className="lottie">
                    <Lottie options={lottieOptions}
                    />

                </div>
            </div>
        )
    }
}