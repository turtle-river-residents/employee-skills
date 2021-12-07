import React from 'react'
import {Button} from "react-bootstrap";

const EsCancelButton = (props: any) => {
    return (
        <React.StrictMode>
            <Button
                variant='secondary'
                size='lg'
                onClick={props.onClick}>
                {props.label}
            </Button>

        </React.StrictMode>
    );
}

export default EsCancelButton