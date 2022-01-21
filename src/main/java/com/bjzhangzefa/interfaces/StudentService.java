package com.bjzhangzefa.interfaces;

import com.bjzhangzefa.dao.Student;
import com.bjzhangzefa.dao.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentService {
    public List<Student> returnList();
    public Student selectById(Integer id);
    public void insertStudent(Student student);
    public void updateStudent(@Param("setName") String o, @Param("getName") String ob);
    public List<Student> selectByName(Student student);
    public List<Student> selectStudent(@Param("obj") Student student,@Param("ppp") Student student1);
    public List<Student> selectName(String s,String o);
    public Map resultMap(Integer id);
    public List<Teacher> resultTeacher();
    public List<Teacher> selectTeacher();
    public List<Student> mohuOne(String phone);
    public List<Student> mohuTwo(String phone);
    List<Student> whereIf(Student student);
    List<Student> whereIfOr(Student student);
    List<Student> listForeach(List<Integer> list);
    List<Student> sql();

}
