import React from 'react';
import ReactDOM from 'react-dom';
import './reset.css'
import './index.css';
import App from './App';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'react-inputs-validation/lib/react-inputs-validation.min.css';

import { BrowserRouter, Switch, Route } from 'react-router-dom'

import NotFound from './components/pages-statics/NotFound'
import Home from './components/Home/Home'
import Hospedagem from './components/Hospedagem/Hospedagem'
import Finalizar from './components/finalizar/Finalizar';
import Resumo from './components/finalizar/Resumo/Resumo';

ReactDOM.render(
    <BrowserRouter>
        <Switch>

            <Route path="/" exact={true} component={App}></Route>
            <Route path="/home" exact={true} component={Home}></Route>
            <Route path="/hospedagem" exact={true} component={Hospedagem}></Route>
            <Route path="/finalizar" exact={true} component={Finalizar}></Route>
            <Route path="/resumo" exact={true} component={Resumo}></Route>
            <Route component={NotFound}></Route>


        </Switch>
    </BrowserRouter>, document.getElementById('root'));

