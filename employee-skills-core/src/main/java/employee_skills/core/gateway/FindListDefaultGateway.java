package employee_skills.core.gateway;

import java.util.List;

public interface FindListDefaultGateway<C, R> {

    List<R> findBy(C criteria);
}
