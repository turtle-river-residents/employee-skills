import React from 'react'
import {Button} from "react-bootstrap";

const EsNewButton = (props: any) => {
    return (
        <React.StrictMode>
            <Button
                variant='success'
                size='lg'
                onClick={props.onClick}>
                {props.label}
            </Button>

        </React.StrictMode>
    );
}

export default EsNewButton