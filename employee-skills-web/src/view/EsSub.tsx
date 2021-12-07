import React from "react";

import {Modal} from "react-bootstrap";
import '../css/es_sub.css'

const EsSub = (props: any) => {
    return (
        <Modal
            {...props}
            size="lg"
            aria-labelledby="contained-modal-title-vcenter"
            centered
        >
            <Modal.Header closeButton>
                <Modal.Title id="contained-modal-title-vcenter">
                    Add Employee
                </Modal.Title>
            </Modal.Header>
            <Modal.Body>
                <div id={'modal_body'}>
                    {props.view}
                </div>
            </Modal.Body>
        </Modal>
    )
}

export default EsSub
