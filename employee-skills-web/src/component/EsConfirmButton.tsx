import React from 'react'
import {Button} from "react-bootstrap";

const EsConfirmButton = (props: any) => {
    return (
        <React.StrictMode>
            <Button
                variant='primary'
                size='lg'
                onClick={props.onClick}>
                {props.label}
            </Button>

        </React.StrictMode>
    );
}

export default EsConfirmButton