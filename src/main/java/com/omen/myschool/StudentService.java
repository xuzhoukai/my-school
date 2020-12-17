package com.omen.myschool;

import com.omen.myschool.entity.Student;
import com.omen.myschool.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    public int insertStudentBatch(){
        List<Student> studentList = new ArrayList<>();
        for(int i =0;i < 5;i++){
            Student student = new Student();
            student.setName("开心"+i);
            studentList.add(student);
        }
        if (studentList.size() ==0){
            return 0;
        }
        int result = studentMapper.insertStudentBatch(studentList);
        return result;
    }
}
