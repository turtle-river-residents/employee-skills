import React from "react";
import {FloatingLabel, Form, InputGroup} from "react-bootstrap";

import '../css/component/es_input.css'

const EsInput = (props: any) => {
    return (
        <React.StrictMode>
            <div>
                <FloatingLabel
                    controlId={props.id}
                    label={props.label}
                    className="mb-3"
                >
                    <Form.Control type="input" placeholder="dummy" onChange={props.onChange}/>
                </FloatingLabel> <InputGroup size="lg">
            </InputGroup>
                <br/>
            </div>

        </React.StrictMode>
    )
}

export default EsInput