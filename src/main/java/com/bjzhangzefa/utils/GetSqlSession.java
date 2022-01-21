package com.bjzhangzefa.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {
    static SqlSession session = null;
    static String my = "mybatis.xml";//核心配置文件名
    static InputStream resourceAsStream = null;//获取核心配置文件
    static {

        try {
            resourceAsStream = Resources.getResourceAsStream(my);//获取核心配置文件
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(resourceAsStream);
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        if (session != null) {
            return session;
        }
        return session;
    }
}
