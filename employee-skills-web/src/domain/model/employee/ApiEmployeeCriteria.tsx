export default class ApiEmployeeCriteria {
    get dummy(): string {
        return this._dummy;
    }

    private readonly _dummy: string

    constructor(dummy: string) {
        this._dummy = dummy
    }
}


