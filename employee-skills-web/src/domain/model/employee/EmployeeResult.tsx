export default class EmployeeResult {
    private readonly _employeeNo: string
    private readonly _name: string
    private readonly _joinYear: number
    private readonly _skillNameList: string

    constructor(employeeNo: string, name: string, joinYear: number, skillNameList: string) {
        this._employeeNo = employeeNo;
        this._name = name;
        this._joinYear = joinYear;
        this._skillNameList = skillNameList;
    }

    get employeeNo(): string {
        return this._employeeNo;
    }

    get name(): string {
        return this._name;
    }

    get joinYear(): number {
        return this._joinYear;
    }

    get skillNameList(): string {
        return this._skillNameList;
    }
}


