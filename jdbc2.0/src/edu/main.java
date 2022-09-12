package edu;

import com.util.ConfigManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try{
            String ConfigManager = "";
            Connection con = DriverManager.getConnection(ConfigManager);
            Statement sta = con.createStatement();
            String     sql = "select * from stuinfo";
            ResultSet res = sta.executeQuery(sql);
            while (res.next()){
                System.out.println("学号:"+res.getString("StuNo"));
                System.out.println("姓名:"+res.getString("StuName"));
                System.out.println("性别:"+res.getBoolean("Sex"));
                System.out.println("年龄"+res.getString("Age"));
            }
            sta.close();
            res.close();
            con.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
