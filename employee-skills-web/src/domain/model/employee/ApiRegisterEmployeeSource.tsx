export default class ApiRegisterEmployeeSource {
    private readonly _employeeNo: string
    private readonly _lastName: string
    private readonly _firstName: string
    private readonly _joinYear: string
    private readonly _skillList: string[]

    constructor(employeeNo: string, lastName: string, firstName: string, joinYear: string, skillList: string[]) {
        this._employeeNo = employeeNo;
        this._lastName = lastName;
        this._firstName = firstName;
        this._joinYear = joinYear;
        this._skillList = skillList;
    }

    get employeeNo(): string {
        return this._employeeNo;
    }

    get lastName(): string {
        return this._lastName;
    }

    get firstName(): string {
        return this._firstName;
    }

    get joinYear(): string {
        return this._joinYear;
    }

    get skillList(): string[] {
        return this._skillList;
    }

    toJson(): any {
        return {
            employeeNo: this.employeeNo,
            lastName: this.lastName,
            firstName: this.firstName,
            joinYear: this.joinYear,
            skillList: this.skillList
        }
    }
}