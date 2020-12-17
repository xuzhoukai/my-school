package com.omen.myschool;

import com.omen.myschool.entity.Student;
import com.omen.myschool.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student findStudent(long id){
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    public int insertStudent(Student student){
        int result = studentMapper.insert(student);
        return result;
    }
}
