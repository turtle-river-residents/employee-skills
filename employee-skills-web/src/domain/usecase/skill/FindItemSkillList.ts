import EsAxios from "../../../support/EsAxios";

export default function findItemSkillList(): Promise<any> {
    return new EsAxios().getNoParam('/item/skill')
}