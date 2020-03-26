import React from 'react'

import { BrowserRouter , Route , Switch} from 'react-router-dom'
import Home from './components/Home'
import Login from './components/Login'
const Routes = () =>(
    <BrowserRouter>
        <Switch>
            <Route exact path="/home" component={Home}/>
            <Route exact path="/" component={Login}/>
                

            
        </Switch>
    </BrowserRouter>

);

export default Routes;