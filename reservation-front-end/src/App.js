import React from 'react';
import './App.css';
import Login from './components/Login/Login' 
import 'materialize-css/dist/css/materialize.min.css';

class App extends React.Component{
   
  
  render() {
    return (
      <>
        <div className="App-body">
          <Login></Login>
        </div>
      </>
    );
  }
  

}

export default App;
