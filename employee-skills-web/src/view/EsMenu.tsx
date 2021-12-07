import React from 'react'
import {Link} from "react-router-dom";

import '../css/es_menu.css'

const EsMenu = () => {
    return (
        <React.StrictMode>
            <ul id='nav'>
                <li><Link to='/app/top'>TOP</Link></li>
                <li><Link to='/app/employee'>EmpSkill</Link></li>
            </ul>
        </React.StrictMode>
    )
}

export default EsMenu