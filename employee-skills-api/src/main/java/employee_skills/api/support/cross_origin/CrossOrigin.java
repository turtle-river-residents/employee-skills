package employee_skills.api.support.cross_origin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.StringUtils;

@ConfigurationProperties(prefix = "cross.origin")
@Data
@NoArgsConstructor
@Slf4j
public class CrossOrigin {
    private String protocols;
    private String ips;
    private String ports;
    private String urls;
    private String methods;

    public String[] getAllowedMethods() {
        return toArray(getMethods());
    }

    public String[] getAllowedOrigins() {
        List<String> retList = new ArrayList<>(Arrays.asList(toArray(getUrls())));

        String[] protocols = toArray(getProtocols());
        String[] ips = toArray(getIps());
        String[] ports = toArray(getPorts());

        for (String protocol : protocols) {
            for (String ip : ips) {
                for (String port : ports) {
                    String url = String.format("%s://%s:%s", protocol, ip, port);
                    retList.add(url);
                }
            }
        }

        retList.stream().map(url -> String.format("API接続を許可します。: %s", url)).forEach(log::info);

        return retList.toArray(new String[retList.size()]);
    }

    private String[] toArray(String str) {
        return StringUtils.tokenizeToStringArray(str, ",");
    }

}
