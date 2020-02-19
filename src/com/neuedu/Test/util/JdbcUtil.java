package com.neuedu.Test.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13930 on 2020/2/19.
 */
public class JdbcUtil {
    private static final String URL="jdbc:mysql://192.168.138.130:3306/MyDB?useUnicode=true&characterEncoding=utf-8";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnnection(){
        Connection con = null;
        try {
          con =   DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装通用查询
    public static <T>List<T> executeQuery(String sql,Class<T> clz,Object... params){
        List<T> list = new ArrayList<>();
        Connection con =getConnnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for (int i = 0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs = pstmt.executeQuery();
            while(rs.next()){
                //创建T类型的对象 往进放
                //通过反射class 对象调用无参构造来创建对象
                T t = clz.newInstance();
                //通过字段名从 rs 中拿值 后赋值给对象
                //先获取有多少个属性
                Field[] field = clz.getDeclaredFields();
                for(Field f:field){
                   Object value =  rs.getObject(f.getName());
                    //为属性赋值
                    f.setAccessible(true);
                    f.set(t,value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  list;
    }
    //通用 增删改
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection con =getConnnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for (int i = 0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }
    //封装关闭的
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if(pstmt != null)
                 pstmt.close();
            if(con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            if (rs!=null)
                rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
