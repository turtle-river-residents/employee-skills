import axios, {AxiosResponse} from "axios";

const DEFAULT_URL: string = 'http://localhost:8080/api'

export default class EsAxios<S, R> {

    post(url: string, source: S): Promise<AxiosResponse<R> | any[]> {
        return axios.post(DEFAULT_URL + url, source)
            .then((res) => {
                return res.data
            })
            .catch(() => {
                return []
            })
    }

    getNoParam(url: string): Promise<AxiosResponse<R> | any[]> {
        return axios.get(DEFAULT_URL + url)
            .then((res) => {
                return res.data
            })
            .catch(() => {
                return []
            })
    }

}
