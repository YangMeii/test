package com.bjzhangzefa;

import com.bjzhangzefa.dao.Student;
import com.bjzhangzefa.dao.Teacher;
import com.bjzhangzefa.interfaces.StudentService;
import com.bjzhangzefa.utils.GetSqlSession;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class test {
    SqlSession session =  GetSqlSession.getSqlSession();
    StudentService studentService =  session.getMapper(StudentService.class);

    @Test
    public void text(){
        List<Student> returnList = session.selectList("returnList");
        returnList.forEach(student -> System.out.println(student));
//        studentService.returnList();
    }
    @Test
    public void selectById(){
        studentService.selectById(3);
    }
    @Test
    public void insertStudent(){
        Student student = new Student("哈哈",21,"云南",1887799455L);
        studentService.insertStudent(student);
        session.commit();

    }
    @Test
    public void tet(){
        System.out.println(GetSqlSession.getSqlSession().getClass().getName());
    }
    @Test
    public void updateStudent(){
        StudentService studentService = session.getMapper(StudentService.class);
        studentService.updateStudent("十全十美","邹薇");
        session.commit();
    }

   @Test
    public void selectStudent() {
        StudentService studentService = session.getMapper(StudentService.class);
        Student student1 = new Student();
        student1.setName("李四");
        Student student2 = new Student();
        student2.setAge(23);
        List<Student> a =  studentService.selectStudent(student1,student2);
        a.forEach(student -> System.out.println(student));
    }
    @Test
    public void selectByName(){
        Student student1 = new Student();
        student1.setName("李四");
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Student> list =  studentService.selectByName(student1);
        //list.forEach(student2 -> System.out.println(student2));
    }
    @Test
    public void s(){
        GetSqlSession.getSqlSession();
    }
    @Test
    public void one(){
        StudentService mapper = session.getMapper(StudentService.class);
        mapper.selectName("杨海龙","李四");
    }
    @Test
    public void two(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        Map map = studentService.resultMap(1);
        System.out.println(map);
    }
    @Test
    public void three(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Student> list = studentService.returnList();
       list.forEach(student -> System.out.println(student));
    }
    @Test
    public void four(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Teacher> teachers = studentService.resultTeacher();
        teachers.forEach(teacher -> System.out.println(teacher));
    }
    @Test
    public void five(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Teacher> teachers = studentService.selectTeacher();
        teachers.forEach(teacher -> System.out.println(teacher));
    }
    @Test
    public void six(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Student> list = studentService.mohuOne("%1%");
        list.forEach(student -> System.out.println(student));
    }
    @Test
    public void seven(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Student> list = studentService.mohuTwo("1");
        list.forEach(student -> System.out.println(student));
    }
    @Test
    public void eight(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        Student student = new Student();
        student.setId(0);
        student.setName("杨海龙");
        List<Student> list = studentService.whereIf(student);
        list.forEach(student1 -> System.out.println(student1));

    }
    @Test
    public void nine(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        Student student = new Student();
        student.setId(0);
        //student.setName("杨海龙");
        List<Student> list = studentService.whereIfOr(student);
        list.forEach(student1 -> System.out.println(student1));
    }
    @Test
    public void ten(){
        StudentService mapper = session.getMapper(StudentService.class);
        StudentService studentService =  session.getMapper(StudentService.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Student> list1 = studentService.listForeach(list);
        list.forEach(student1 -> System.out.println(student1));
    }

}