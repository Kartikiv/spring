package com.testskill.db.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.testskill.db.dao.entity.Students;

@Repository
public class StudentsDao {
@Autowired
NamedParameterJdbcTemplate template;
static String INSERT="insert into students (id,name,marks) values(:id,:name,:marks)";
public Students save(Students student) {
    MapSqlParameterSource map=new MapSqlParameterSource();
    map.addValue("name", student.getName());
    map.addValue("id", student.getId());
    map.addValue("marks", student.getMarks());
	template.update(INSERT, map);
	return student;
}
public  Students update (Students student) {
	return student;
	
}
public Students getById(Long id) {
	return null;
	
}
public List<Students> getAll(){
	return null;
	
}
public int deleteByID(Long id) {
	return 0;
	
}
}
