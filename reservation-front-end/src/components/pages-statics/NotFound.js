// UncontrolledLottie.jsx
import React, { Component } from 'react'
import Lottie from 'react-lottie'
import animationData from './animacao.json'
import './NotFound.css'

class NotFound extends Component {


    render() {

        const defaultOptions = {
            loop: true,
            autoplay: true,
            animationData: animationData,
            rendererSettings: {
                preserveAspectRatio: 'xMidYMid slice'
            }
        };

        return (
            <div className="bodyNotFound">
                <h1>Página não encontrada</h1>
                <div className="lottie">
                    <Lottie options={defaultOptions}
                    />

                </div>

            </div>
        )
    }
}

export default NotFound;