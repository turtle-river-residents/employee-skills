import EmployeeResult from "../../model/employee/EmployeeResult";
import ApiEmployeeCriteria from "../../model/employee/ApiEmployeeCriteria";
import EsAxios from "../../../support/EsAxios";

export default function findListEmployee(criteria: ApiEmployeeCriteria): Promise<any[]> {
    // @ts-ignore
    return new EsAxios<ApiEmployeeCriteria, EmployeeResult>()
        .post('/employeeSkills/find', criteria)
}