package com.testskill.db.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testskill.db.dao.StudentsDao;
import com.testskill.db.dao.entity.Students;

@RestController
public class StudentsController {
	@Autowired
	StudentsDao temp;

	@PostMapping("/stu")
	public Students save(@RequestBody Students s) {
		return temp.save(s);
	}

}
