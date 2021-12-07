package employee_skills.api.convert.employee_with_skills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;

@ExtendWith(MockitoExtension.class)
class FindListEmployeeWithSkillsConverterImplTest {

    @Test
    void convert() {
        var source = ApiEmployeeCriteria.builder().build();
        var actual = target.convert(source);
        var expected = EmployeeCriteria.builder().build();

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private FindListEmployeeWithSkillsConverterImpl target;
}