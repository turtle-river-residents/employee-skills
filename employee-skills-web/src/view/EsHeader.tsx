import React from 'react'

import logo from '../logo.svg'
import '../css/es_header.css'

const EsHeader = () => {
    return (
        <React.StrictMode>
            <header>
                <img src={logo} className="App-logo" alt="logo"/>
            </header>
        </React.StrictMode>
    )
}

export default EsHeader