package com.bjzhangzefa.test;

import com.bjzhangzefa.dao.Student;
import com.bjzhangzefa.interfaces.StudentService;
import com.bjzhangzefa.utils.GetSqlSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = GetSqlSession.getSqlSession();//自己封装的工具类，可以拿到SqlSession对象
        StudentService studentService =  sqlSession.getMapper(StudentService.class);//通过接口反射拿到一个接口实现类
        List<Student> students = studentService.returnList();//通过实现类调用接口中的方法，相当于调用了sql映射文件里的sql语句
        students.forEach(student -> System.out.println(student));
    }
}
