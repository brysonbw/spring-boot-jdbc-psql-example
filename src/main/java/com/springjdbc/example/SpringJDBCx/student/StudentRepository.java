package com.springjdbc.example.SpringJDBCx.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String query = "insert into student (rollNum, name, marks) values (?,?,?)";
       int rows = jdbc.update(query, s.getRollNum(), s.getName(), s.getMarks());
        System.out.println(rows + " entry added");

    }

    public List<Student> findAll() {
        String query = "select * from student";
        RowMapper<Student> mapper = (result, rowNum) ->
        {
            Student s = new Student();
            s.setRollNum(result.getInt("rollNum"));
            s.setName(result.getString("name"));
            s.setMarks(result.getInt("marks"));
            return s;

        };
        return jdbc.query(query, mapper);

    }
}
