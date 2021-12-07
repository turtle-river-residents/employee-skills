import React, {useState} from 'react'

import EsCancelButton from "../../component/EsCancelButton";
import EsConfirmButton from "../../component/EsConfirmButton";
import EsNewButton from "../../component/EsNewButton";
import EsTable from "../../component/EsTable";
import EsSub from "../EsSub";

import EmployeeResult from "../../domain/model/employee/EmployeeResult";
import '../../css/employee/employee_list_view.css'
import findListEmployee from "../../domain/usecase/employee/FindListEmployee";
import RegisterEmployeeView from "./RegisterEmployeeView";
import EsInput from "../../component/EsInput";
import ApiEmployeeCriteria from "../../domain/model/employee/ApiEmployeeCriteria";

const EmployeeListView = () => {
    const [result, setResult] = useState<EmployeeResult[]>([])
    const [modalShow, setModalShow] = React.useState(false)

    return (
        <React.StrictMode>
            <EsSub
                show={modalShow}
                onHide={() => setModalShow(false)}
                view={<RegisterEmployeeView/>}
            />

            <div className={'es_form'}>
                <EsInput
                    label={'Employee No'}
                    id={'employeeNo'}
                />
            </div>

            <div className='es_button'>
                <EsConfirmButton
                    label='SEARCH'
                    onClick={() => {
                        let criteria = new ApiEmployeeCriteria('dummy')

                        findListEmployee(criteria)
                            .then((res) => {
                                setResult(res)
                            })
                    }}
                />

                <EsCancelButton
                    label='CLEAR'
                    onClick={() => {
                        setResult([])
                    }}
                />

                <EsNewButton
                    label='ADD'
                    onClick={() => {
                        setModalShow(true)
                    }}
                />
            </div>

            <EsTable
                id={'employeeTable'}
                headers={['Emp No', 'Name', 'Join Year', 'Skill', 'Edit']}
                body={result.map((e: EmployeeResult, i: number) => {
                    return (
                        <React.StrictMode key={'employee' + i}>
                            <tr>
                                <td>{e.employeeNo}</td>
                                <td>{e.name}</td>
                                <td align={'center'}>{e.joinYear}</td>
                                <td>{e.skillNameList}</td>
                                <td align={'center'}>E</td>
                            </tr>
                        </React.StrictMode>
                    )
                })}
            />
        </React.StrictMode>
    );
}

export default EmployeeListView
