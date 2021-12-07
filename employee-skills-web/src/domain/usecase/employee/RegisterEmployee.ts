import ApiRegisterEmployeeSource from "../../model/employee/ApiRegisterEmployeeSource";
import EsAxios from "../../../support/EsAxios";

export default function registerEmployee(emp: ApiRegisterEmployeeSource) {
    // @ts-ignore
    return new EsAxios<ApiRegisterEmployeeSource>().post('/employee/register', emp.toJson())
}