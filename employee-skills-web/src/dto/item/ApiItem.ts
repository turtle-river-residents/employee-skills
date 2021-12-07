export default class ApiItem {
    private readonly _label: string
    private readonly _value: string

    constructor(label: string, value: string) {
        this._label = label;
        this._value = value;
    }

    get label(): string {
        return this._label;
    }

    get value(): string {
        return this._value;
    }
}