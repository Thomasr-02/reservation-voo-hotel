import React from 'react';
import './App.css';
import Login from './components/Login';
import lottieControl from './components/lottieControl';

import Routes from './routes';
import Lottie from 'react-lottie';

class App extends React.Component{
   render() {
    return (
      <>
        <body className="App-body">
          <Login/>
        </body>
      </>
    );
  }
  

}

export default App;
