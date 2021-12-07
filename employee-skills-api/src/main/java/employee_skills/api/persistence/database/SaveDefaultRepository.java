package employee_skills.api.persistence.database;

public interface SaveDefaultRepository<D, E> {

    E convert(D target);

    int save(E entity);

    default int exec(D target) {
        return save(convert(target));
    }
}
