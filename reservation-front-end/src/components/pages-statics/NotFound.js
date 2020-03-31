// UncontrolledLottie.jsx
import React, { Component } from 'react'
import Lottie from 'react-lottie'
import './NotFound.css'
import lottieOptions from './lottieOptions'

class NotFound extends Component {

    render() {

        return (
            <div className="bodyNotFound">
                <h1>Página não encontrada</h1>
                <div className="lottie">
                    <Lottie options={lottieOptions}
                    />

                </div>

            </div>
        )
    }
}

export default NotFound;