package employee_skills.core.domain.usecase;

import java.util.List;

public interface FindListDefaultUseCase<I, O> {

    List<O> handle(I criteria);
}
