package employee_skills.backend.persistence.database.postgresql.table;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DbSkillExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public DbSkillExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSkillIdIsNull() {
            addCriterion("skill_id is null");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNotNull() {
            addCriterion("skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkillIdEqualTo(Integer value) {
            addCriterion("skill_id =", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotEqualTo(Integer value) {
            addCriterion("skill_id <>", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThan(Integer value) {
            addCriterion("skill_id >", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill_id >=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThan(Integer value) {
            addCriterion("skill_id <", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThanOrEqualTo(Integer value) {
            addCriterion("skill_id <=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdIn(List<Integer> values) {
            addCriterion("skill_id in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotIn(List<Integer> values) {
            addCriterion("skill_id not in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdBetween(Integer value1, Integer value2) {
            addCriterion("skill_id between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("skill_id not between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNull() {
            addCriterion("skill_name is null");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNotNull() {
            addCriterion("skill_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkillNameEqualTo(String value) {
            addCriterion("skill_name =", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotEqualTo(String value) {
            addCriterion("skill_name <>", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThan(String value) {
            addCriterion("skill_name >", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThanOrEqualTo(String value) {
            addCriterion("skill_name >=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThan(String value) {
            addCriterion("skill_name <", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThanOrEqualTo(String value) {
            addCriterion("skill_name <=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLike(String value) {
            addCriterion("skill_name like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotLike(String value) {
            addCriterion("skill_name not like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameIn(List<String> values) {
            addCriterion("skill_name in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotIn(List<String> values) {
            addCriterion("skill_name not in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameBetween(String value1, String value2) {
            addCriterion("skill_name between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotBetween(String value1, String value2) {
            addCriterion("skill_name not between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andGenreIdIsNull() {
            addCriterion("genre_id is null");
            return (Criteria) this;
        }

        public Criteria andGenreIdIsNotNull() {
            addCriterion("genre_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenreIdEqualTo(Long value) {
            addCriterion("genre_id =", value, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdNotEqualTo(Long value) {
            addCriterion("genre_id <>", value, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdGreaterThan(Long value) {
            addCriterion("genre_id >", value, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("genre_id >=", value, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdLessThan(Long value) {
            addCriterion("genre_id <", value, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdLessThanOrEqualTo(Long value) {
            addCriterion("genre_id <=", value, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdIn(List<Long> values) {
            addCriterion("genre_id in", values, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdNotIn(List<Long> values) {
            addCriterion("genre_id not in", values, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdBetween(Long value1, Long value2) {
            addCriterion("genre_id between", value1, value2, "genreId");
            return (Criteria) this;
        }

        public Criteria andGenreIdNotBetween(Long value1, Long value2) {
            addCriterion("genre_id not between", value1, value2, "genreId");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNull() {
            addCriterion("insert_datetime is null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIsNotNull() {
            addCriterion("insert_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeEqualTo(Timestamp value) {
            addCriterion("insert_datetime =", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotEqualTo(Timestamp value) {
            addCriterion("insert_datetime <>", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThan(Timestamp value) {
            addCriterion("insert_datetime >", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("insert_datetime >=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThan(Timestamp value) {
            addCriterion("insert_datetime <", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("insert_datetime <=", value, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeIn(List<Timestamp> values) {
            addCriterion("insert_datetime in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotIn(List<Timestamp> values) {
            addCriterion("insert_datetime not in", values, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("insert_datetime between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertDatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("insert_datetime not between", value1, value2, "insertDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Timestamp value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Timestamp value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Timestamp value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Timestamp value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Timestamp> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Timestamp> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNull() {
            addCriterion("insert_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIsNotNull() {
            addCriterion("insert_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdEqualTo(String value) {
            addCriterion("insert_user_id =", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotEqualTo(String value) {
            addCriterion("insert_user_id <>", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThan(String value) {
            addCriterion("insert_user_id >", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("insert_user_id >=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThan(String value) {
            addCriterion("insert_user_id <", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLessThanOrEqualTo(String value) {
            addCriterion("insert_user_id <=", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdLike(String value) {
            addCriterion("insert_user_id like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotLike(String value) {
            addCriterion("insert_user_id not like", value, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdIn(List<String> values) {
            addCriterion("insert_user_id in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotIn(List<String> values) {
            addCriterion("insert_user_id not in", values, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdBetween(String value1, String value2) {
            addCriterion("insert_user_id between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andInsertUserIdNotBetween(String value1, String value2) {
            addCriterion("insert_user_id not between", value1, value2, "insertUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("update_user_id like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("update_user_id not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated
     */
    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}