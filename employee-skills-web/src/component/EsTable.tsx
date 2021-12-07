import React from "react";
import {Table} from "react-bootstrap";

const EsTable = (props: any) => {
    return (
        <React.StrictMode>
            <Table striped bordered hover id={props.id}>
                <thead>
                <tr>
                    {props.headers.map((label: string, i: number) => {
                        return (
                            <td key={'th' + i}>{label}</td>
                        )
                    })}
                </tr>
                </thead>
                <tbody>
                {props.body}
                </tbody>
            </Table>

        </React.StrictMode>
    )
}

export default EsTable