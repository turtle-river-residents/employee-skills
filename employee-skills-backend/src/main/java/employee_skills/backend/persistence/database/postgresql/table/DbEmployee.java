package employee_skills.backend.persistence.database.postgresql.table;

import java.sql.Timestamp;
import java.time.Year;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DbEmployee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_no
     *
     * @mbg.generated
     */
    private String employeeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.join_year
     *
     * @mbg.generated
     */
    private Year joinYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.insert_datetime
     *
     * @mbg.generated
     */
    private Timestamp insertDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.update_datetime
     *
     * @mbg.generated
     */
    private Timestamp updateDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.insert_user_id
     *
     * @mbg.generated
     */
    private String insertUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.update_user_id
     *
     * @mbg.generated
     */
    private String updateUserId;
}