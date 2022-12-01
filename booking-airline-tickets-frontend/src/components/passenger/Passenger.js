

//const PassengerDataFormContainer = styled.div

import React, { useState } from "react";

//import Form from "react-bootstrap/Form";

//import Button from "react-bootstrap/Button";

//import "./Login.css";

function Passenger() {
  const [firstName, setFirstName] = useState()
  const [sureName, setSureName] = useState()
  const [nationality, setNationality] = useState()
  const [passport, setPassport] = useState()
  const [age, setAge] = useState()

  return (
    <div className='page'>
        <div className='container'>
          <div className='content'>
            <h2>Personal Details</h2>


    <div className="Auth-form-container">
      <form className="Auth-form">
        <div className="Auth-form-content">
          <h3 className="Auth-form-title">Please enter your personal information.</h3>
          <div className="form-group mt-3">
            <label>FirstName</label>

            <div>
            <input
              type="name"
              className="form-control mt-1"
              placeholder="Enter firstame"
              onChange={e => setFirstName(e.target.value)}
              value={firstName}
            />
            </div>
          </div>
          <div className="form-group mt-3">
            <label>SureName</label>

            <div>
            <input
              type="surename"
              className="form-control mt-1"
              placeholder="Enter surename"
              onChange={e => setSureName(e.target.value)}
              value={sureName}
            />
            </div>
          </div>
          <div>
          <div className="form-group mt-3">
            <label>Nationality</label>

            <div>
            <input
              type="nationality"
              className="form-control mt-1"
              placeholder="Nationality"
              onChange={e => setNationality(e.target.value)}
              value={nationality}
            />
            </div>

            </div>
          </div>
          <div className="form-group mt-3">
            <label>Passport</label>

            <div>
            <input
              type="passport"
              className="form-control mt-1"
              placeholder="Enter your passport"
              onChange={e => setPassport(e.target.value)}
              value={passport}
            />
            </div>
          </div>
          <div className="form-group mt-3">
            <label>Age</label>

            <div>
            <input
              type="age"
              className="form-control mt-1"
              placeholder="Enter your age"
              onChange={e => setAge(e.target.value)}
              value={age}
            />
            </div>
          </div>
          
          
         <div className="d-grid gap-2 mt-3">
         
            <button type="save" className="btn btn-primary">
              Save
            </button>
            
          </div>
          
        </div> 
        
      </form>
    </div>
    </div>
    </div>
    </div>
  )
}
 





  export default Passenger;