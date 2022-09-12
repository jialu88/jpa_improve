package com.edu;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String DbUrl = "jdbc:mysql://localhost:3306/stumanagementsys?useSSL=false";
        String UserName = "root";
        String UsePwd = "wjq13893168081";
//        try{
//            Connection con = DriverManager.getConnection(DbUrl,UserName,UsePwd);
//            Statement  sta = con.createStatement();
//            String     sql = "select * from stuinfo";
//            ResultSet  res = sta.executeQuery(sql);
//            while (res.next()){
//                System.out.println("学号:"+res.getString("StuNo"));
//                System.out.println("姓名:"+res.getString("StuName"));
//                System.out.println("性别:"+res.getBoolean("Sex"));
//                System.out.println("年龄"+res.getString("Age"));
//            }
//            sta.close();
//            res.close();
//            con.close();
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }


//        try{
//            Connection con = DriverManager.getConnection(DbUrl,UserName,UsePwd);
//            Statement  sta = con.createStatement();
//            String     sql = "insert into  stuinfo(StuNo,StuName,Age,Sex) values (?,?,?,?)";
//            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setString(1,"20201120326");
//            pre.setString(2,"李嘉璐");
//            pre.setString(3,"21");
//            pre.setBoolean(4,true);
//            int result = pre.executeUpdate();
//            if (result!=0){
//                System.out.println("插入成功");
//            }
////            while (res.next()){
////                System.out.println("学号:"+res.getString("StuNo"));
////                System.out.println("姓名:"+res.getString("StuName"));
////                System.out.println("性别:"+res.getBoolean("Sex"));
////                System.out.println("年龄"+res.getString("Age"));
////            }
//            sta.close();
//            pre.close();
//            con.close();
//        }



        try{
            Connection con = DriverManager.getConnection(DbUrl,UserName,UsePwd);
            Statement  sta = con.createStatement();
            String     sql = "select * from stuinfo where StuNo='20201120325'";
            PreparedStatement pre = con.prepareStatement(sql);
//            pre.setString(1,"20201120325");
            ResultSet res = pre.executeQuery(sql);
            res.next();
            Student s = new Student();
            s.setStuNo(res.getString("StuNo"));
            s.setStuName(res.getString("StuName"));
            s.setAge(res.getString("Age"));
            s.setSex(res.getBoolean("Sex"));
            System.out.println(s);



//            int result = pre.executeUpdate();
//            if (result!=0){
//                System.out.println("插入成功");
//            }

            sta.close();
            pre.close();
            con.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
