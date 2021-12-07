package employee_skills.api.controller_service;

public interface DefaultControllerService<S, R> {

    R handle(S source);
}
