package employee_skills.backend.persistence.database.postgresql.table;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DbGenreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    long countByExample(DbGenreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int deleteByExample(DbGenreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer genreId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int insert(DbGenre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int insertSelective(DbGenre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    List<DbGenre> selectByExample(DbGenreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    DbGenre selectByPrimaryKey(Integer genreId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DbGenre record, @Param("example") DbGenreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DbGenre record, @Param("example") DbGenreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DbGenre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genre
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DbGenre record);
}