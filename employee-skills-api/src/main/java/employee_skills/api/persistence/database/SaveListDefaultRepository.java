package employee_skills.api.persistence.database;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveListDefaultRepository<D> {
    private final List<SaveDefaultRepository<D, ?>> delegates;

    public int save(D target) {
        int saveCnt = 0;
        for (var e : delegates) {
            saveCnt += e.exec(target);
        }
        return saveCnt;
    }
}
