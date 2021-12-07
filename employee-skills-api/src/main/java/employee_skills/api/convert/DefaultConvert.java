package employee_skills.api.convert;

public interface DefaultConvert<I, O> {

    O convert(I source);
}
