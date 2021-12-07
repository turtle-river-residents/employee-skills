import React, {useState} from "react";
import EsConfirmButton from "../../component/EsConfirmButton";
import EsInput from "../../component/EsInput";
import ApiRegisterEmployeeSource from "../../domain/model/employee/ApiRegisterEmployeeSource";
import registerEmployee from "../../domain/usecase/employee/RegisterEmployee";

const RegisterEmployeeView = () => {
    const [employeeNo, setEmployeeNo] = useState('')
    const [lastName, setLastName] = useState('')
    const [firstName, setFirstName] = useState('')
    const [joinYear, setJoinYear] = useState('')

    return (
        <React.StrictMode>
            <div className={'es_form'}>
                <EsInput
                    label={'Employee No'}
                    id={'employeeNo'}
                    onChange={(e: any) => {
                        setEmployeeNo(e.target.value)
                    }}
                />
                <EsInput
                    label={'Last Name'}
                    id={'lastName'}
                    onChange={(e: any) => {
                        setLastName(e.target.value)
                    }}
                />
                <EsInput
                    label={'First Name'}
                    id={'firstName'}
                    onChange={(e: any) => {
                        setFirstName(e.target.value)
                    }}
                />
                <EsInput
                    label={'Join Year'}
                    id={'joinYear'}
                    onChange={(e: any) => {
                        setJoinYear(e.target.value)
                    }}
                />
            </div>

            <div className='es_button'>
                <EsConfirmButton
                    label='ADD'
                    onClick={() => {
                        let emp = new ApiRegisterEmployeeSource(
                            employeeNo,
                            lastName,
                            firstName,
                            joinYear,
                            [])
                        registerEmployee(emp)
                    }}
                />
            </div>
        </React.StrictMode>
    )
}

export default RegisterEmployeeView