import React, { Component } from 'react';
import Select from 'react-select';
//import './'
import Calendar from 'react-calendar';
import {useState} from 'react';
import * as ReactDom from 'react-dom';
import App from '../../App';
import './BookingFlight.css';


const Cities = [
    { label: "Budapest", value: 355 },
    { label: "Seville", value: 54 },
    { label: "Madrid", value: 54 },
    { label: "Lisboa", value: 54 },
    { label: "Berlin", value: 54 },
    { label: "London", value: 54 },
    
  ];



function BookingFlight(){
    const [date, setDate] = useState(new Date())
    const submit = () => {}
    
  
  
   return(
      <div className='page'>
        <div className='container'>
          <div className='content'>
            <h2>Flight Booking</h2>
            
           
              <div className='text-box'>
                <div className="row">
                  <div className="col-md-3">Flying from</div>
                     <div className="col-md-6">
                  <Select options={Cities} />
                  </div>
                    <div className="col-md-4"></div>
  
                <div className="row">
                  <div className="col-md-3">Flying to</div>
                   <div className="col-md-6">
                    <Select options={Cities} />
                </div>
                  <div className="col-md-4"></div>
            </div>
            

            <div className="app">
              <h1 className="header">Departure Day</h1>
                <div className="calendar-container">
                  <Calendar onChange={setDate} value={date}/>
                </div>
              <div className="text-center">
                Selected date: {date.toDateString()}
            </div>
            <div className='luggage'> 
              <p>Do you want luggage?</p>
            </div>
  
            <div className='e-btn-group'>
              <input type="radio" id="radioleft" name="align" value="left"/>
              <label className="e-btn" htmlFor="radioleft">Yes</label>
              <input type="radio" id="radiomiddle" name="align" value="middle"/>
              <label className="e-btn" htmlFor="radiomiddle">No</label>
            
            </div>
            <div>
            <button onClick={submit}>Submit</button>
            </div>
            
  
             </div>
            </div>
          </div>
        </div>
      </div>
    </div> 
  
  
    ); 
  
  }

  export default BookingFlight;