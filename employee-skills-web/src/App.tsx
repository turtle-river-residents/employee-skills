import React from 'react';
import {BrowserRouter, Route, Routes} from "react-router-dom";

import EmployeeListView from "./view/employee/EmployeeListView";
import EsTop from './view/EsTop'
import EsHeader from "./view/EsHeader";
import EsMenu from "./view/EsMenu";

import './css/App.css'
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
    return (
        <div>
            <BrowserRouter>
                <EsHeader/>
                <EsMenu/>
                <div className='es_body'>
                    <Routes>
                        <Route path="/" element={<EsTop/>}/>
                        <Route path="/app/top" element={<EsTop/>}/>
                        <Route path="/app/employee" element={<EmployeeListView/>}/>
                    </Routes>
                </div>
            </BrowserRouter>
        </div>
    );
}

export default App;