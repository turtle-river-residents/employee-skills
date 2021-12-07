CREATE TABLE genre
(
    genre_id        SERIAL       NOT NULL,
    genre_name      VARCHAR(100) NOT NULL,
    insert_datetime TIMESTAMP    NOT NULL,
    update_datetime TIMESTAMP    NOT NULL,
    insert_user_id  VARCHAR(10)  NOT NULL,
    update_user_id  VARCHAR(10)  NOT NULL,
    CONSTRAINT genre_pk PRIMARY KEY (genre_id)
);

COMMENT
ON TABLE genre IS 'ジャンル';
COMMENT
ON COLUMN genre.genre_id IS 'ジャンルID';
COMMENT
ON COLUMN genre.genre_name IS 'ジャンル名';
COMMENT
ON COLUMN genre.insert_datetime IS '登録日時';
COMMENT
ON COLUMN genre.update_datetime IS '更新日時';
COMMENT
ON COLUMN genre.insert_user_id IS '登録ユーザID';
COMMENT
ON COLUMN genre.update_user_id IS '更新ユーザID';

CREATE TABLE skill
(
    skill_id        SERIAL       NOT NULL,
    skill_name      VARCHAR(100) NOT NULL,
    genre_id        BIGINT       NOT NULL,
    insert_datetime TIMESTAMP    NOT NULL,
    update_datetime TIMESTAMP    NOT NULL,
    insert_user_id  VARCHAR(10)  NOT NULL,
    update_user_id  VARCHAR(10)  NOT NULL,
    CONSTRAINT skill_pk PRIMARY KEY (skill_id)
);

ALTER TABLE skill
    ADD CONSTRAINT skill_genre_genre_id_fk FOREIGN KEY (genre_id) REFERENCES genre;

COMMENT
ON TABLE skill IS 'スキル';
COMMENT
ON COLUMN skill.skill_id IS 'スキルID';
COMMENT
ON COLUMN skill.skill_name IS 'スキル名';
COMMENT
ON COLUMN skill.genre_id IS 'ジャンルID';
COMMENT
ON COLUMN skill.insert_datetime IS '登録日時';
COMMENT
ON COLUMN skill.update_datetime IS '更新日時';
COMMENT
ON COLUMN skill.insert_user_id IS '登録ユーザID';
COMMENT
ON COLUMN skill.update_user_id IS '更新ユーザID';

CREATE TABLE employee
(
    employee_no     VARCHAR(8)   NOT NULL,
    last_name       VARCHAR(100) NOT NULL,
    first_name      VARCHAR(100) NOT NULL,
    join_year       INT          NOT NULL,
    insert_datetime TIMESTAMP    NOT NULL,
    update_datetime TIMESTAMP    NOT NULL,
    insert_user_id  VARCHAR(10)  NOT NULL,
    update_user_id  VARCHAR(10)  NOT NULL,
    CONSTRAINT employee_pk PRIMARY KEY (employee_no)
);

COMMENT
ON TABLE employee IS '社員';
COMMENT
ON COLUMN employee.employee_no IS '社員番号';
COMMENT
ON COLUMN employee.last_name IS '姓';
COMMENT
ON COLUMN employee.first_name IS '名';
COMMENT
ON COLUMN employee.join_year IS '入社年（西暦）';
COMMENT
ON COLUMN employee.insert_datetime IS '登録日時';
COMMENT
ON COLUMN employee.update_datetime IS '更新日時';
COMMENT
ON COLUMN employee.insert_user_id IS '登録ユーザID';
COMMENT
ON COLUMN employee.update_user_id IS '更新ユーザID';

CREATE TABLE employee_skills
(
    employee_no     VARCHAR(8)  NOT NULL,
    skill_id        BIGINT      NOT NULL,
    insert_datetime TIMESTAMP   NOT NULL,
    update_datetime TIMESTAMP   NOT NULL,
    insert_user_id  VARCHAR(10) NOT NULL,
    update_user_id  VARCHAR(10) NOT NULL,
    CONSTRAINT employee_skills_pk PRIMARY KEY (employee_no, skill_id)
);

ALTER TABLE employee_skills
    ADD CONSTRAINT employee_skills_employee_no_fk FOREIGN KEY (employee_no) REFERENCES employee;
ALTER TABLE employee_skills
    ADD CONSTRAINT employee_skills_skill_id_fk FOREIGN KEY (skill_id) REFERENCES skill;


COMMENT
ON TABLE employee_skills IS '社員スキル';
COMMENT
ON COLUMN employee_skills.employee_no IS '社員番号';
COMMENT
ON COLUMN employee_skills.skill_id IS 'スキルID';
COMMENT
ON COLUMN employee_skills.insert_datetime IS '登録日時';
COMMENT
ON COLUMN employee_skills.update_datetime IS '更新日時';
COMMENT
ON COLUMN employee_skills.insert_user_id IS '登録ユーザID';
COMMENT
ON COLUMN employee_skills.update_user_id IS '更新ユーザID';
