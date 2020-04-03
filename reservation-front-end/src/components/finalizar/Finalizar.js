import React, { Component } from 'react'
import Lottie from 'react-lottie'
import lottieOptions from './lottieOptions '
import './Finalizar.css'

export default class extends Component{


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