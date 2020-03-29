import React from 'react';
import './App.css';
import lottieControl from './components/lottieControl';
import Login from './components/Login' 
import Lottie from 'react-lottie';

class App extends React.Component{
   render() {
    return (
      <>
        <body className="App-body">
          <Login></Login>
        </body>
      </>
    );
  }
  

}

export default App;
