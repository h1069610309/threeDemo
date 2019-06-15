package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.StudentDao;
import com.mypack.entity.Student;
@Transactional
@Service
public class StudentServiceImpl implements StudentServiceIF {
	@Autowired
	StudentDao studentDao;
	
	public StudentDao getstudentDao() {
		return studentDao;
	}

	public void setstudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	/* (non-Javadoc)
	 * @see com.mypack.service.StudentServiceIF#listAllStu()
	 */
	@Override
	public List<Student> listAllStu(){
		
		return studentDao.queryAllStudents();
	}


}
