package com.itheima;

import com.mysql.jdbc.*;

import java.security.spec.ECField;
import java.sql.*;
public class HelloWorld {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "sayno";
        String passwd = "123456";
        Connection connection = DriverManager.getConnection(url, user, passwd);
        String sql_update = "update accout set money = 20300 where id = 1;";
        Statement statement = connection.createStatement();
        int c = statement.executeUpdate(sql_update);
//        String insert_sql = "insert into accout values(2, 2000);";
//        int d = statement.executeUpdate(insert_sql);
        String select_str = "select * from accout";
        ResultSet set = statement.executeQuery(select_str);
        while (set.next()){
            System.out.println("编号：" + set.getString("id") + "余额：" + set.getDouble("money"));
        }
        System.out.println(c);
        set.close();
        statement.close();
        connection.close();
        String s = "I have 周国良";
        System.out.println(s.matches("\\w"));
        System.out.println("开始 JDBC 规范代码的输出");
//        query();
//        apiTest();
        System.out.println(login("2 or 'a'='a'", "2000"));
        System.out.println(login2("2 or 'a'='a'", "2000"));
    }

    public static boolean login2(String name, String money){
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try{
            String driverClassName = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "sayno";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            String query = "select * from accout where id=? and money=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, money);
            if (set == null){
                return false;
            }
            return set.next();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }finally {
            try {
                if (set != null) set.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


    public static boolean login(String name, String money){
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try{
            String driverClassName = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "sayno";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String query = "select * from accout where id=" + name + " and money=" + money;
            System.out.println(query);
            set = statement.executeQuery(query);
            return set.next();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }finally {
            try {
                if (set != null) set.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void apiTest(){
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try{
            String driverClassName = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "sayno";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String select_str = "select * from accout";
            set = statement.executeQuery(select_str);
            System.out.println(set.isFirst());
            System.out.println(set.getRow());
            System.out.println(set.relative(1));
//            while (set.next()){
//                System.out.println("编号：" + set.getString("id") + "余额：" + set.getDouble("money"));
//            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (set != null) set.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void query() throws Exception{
        String driverClassName = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "sayno";
        String password = "123456";
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try{
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String select_str = "select * from accout";
            set = statement.executeQuery(select_str);

            while (set.next()){
                System.out.println("编号：" + set.getString("id") + "余额：" + set.getDouble("money"));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (set != null){
                set.close();
            }
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
    }
}
