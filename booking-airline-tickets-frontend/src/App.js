
//import React, { useEffect, useState } from 'react';
import React, { Component } from 'react';
import "./App.css";
//import Select from 'react-select';
//import './'
//import Calendar from 'react-calendar';
import {useState} from 'react';
//import * as ReactDom from 'react-dom';
import BookingFlight from './components/bookingFlights/BookingFlight'
//import Header from './components/Header';
//import { SelectButton } from 'primereact/selectbutton';
//import Dropdown from 'react-bootstrap/Dropdown';
/*import Header from './components/passenger';*/
import Passenger from './components/passenger/Passenger';




function App(){
  const [count, setCount] = useState(0)
    return(
    
      <div><Passenger/></div>
); 

}




export default App;
