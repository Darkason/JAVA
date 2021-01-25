package com.day15;

import com.day15.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StuDao {
    public static void main(String[] args) throws Exception {
//        ArrayList<Stu> list = select("阿");
        ArrayList<Stu> list = select(4);
        list.stream().forEach(System.out::println);
//        list.stream().forEach(n -> {
//            System.out.println(n);
//        });
//        Stu stu = new Stu(10, 2, "老陈", "男", 22);
//        add(stu);
//        ArrayList<Stu> arrayList = new ArrayList<>();
//        Stu stu1 = new Stu(21, 2, "老陈", "男", 22);
//        Stu stu2 = new Stu(12, 2, "老陈", "男", 22);
//        Stu stu3 = new Stu(123, 2, "老陈", "男", 22);
//        arrayList.add(stu1);
//        arrayList.add(stu2);
//        arrayList.add(stu3);
//        add(arrayList);
//        delete(9);
//        update(stu);
    }

    public static void add(Stu stu) throws Exception {
        Connection conn = JdbcUtil.getConnection();
        String sql = "insert into stu(class_id,name,sex,age) values (?,?,?,?)";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, stu.getClassId());
        prep.setString(2, stu.getName());
        prep.setString(3, stu.getSex());
        prep.setInt(4, stu.getAge());
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("Finally successful " + result + " row");
        } else {
            System.out.println("Error");
        }
        JdbcUtil.close(prep, conn);
    }

    public static void delete(Integer id) throws Exception {
        Connection conn = JdbcUtil.getConnection();
        String sql = "delete from stu where id=?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, id);
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("Finally successful " + result + " row");
        } else {
            System.out.println("Error");
        }
        JdbcUtil.close(prep, conn);
    }

    public static void update(Stu stu) throws Exception {
        Connection conn = JdbcUtil.getConnection();
        String sql = "update stu set class_id=?,name=?,sex=?,age=? where id=?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, stu.getClassId());
        prep.setString(2, stu.getName());
        prep.setString(3, stu.getSex());
        prep.setInt(4, stu.getAge());
        prep.setInt(5, stu.getId());
        int result = prep.executeUpdate();
        if (result > 0) {
            System.out.println("Finally successful " + result + " row");
        } else {
            System.out.println("Error");
        }
        JdbcUtil.close(prep, conn);
    }

    public static ArrayList<Stu> select(String name) throws SQLException {
        ArrayList<Stu> list = new ArrayList<>();
        Connection conn = JdbcUtil.getConnection();
        String sql = "select * from stu where name like ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setString(1, "%" + name + "%");
        ResultSet rs = prep.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            int classId = rs.getInt("class_id");
            String sname = rs.getString("name");
            String sex = rs.getString("sex");
            int age = rs.getInt("age");
            Stu stu = new Stu();
            stu.setId(id);
            stu.setClassId(classId);
            stu.setName(sname);
            stu.setSex(sex);
            stu.setAge(age);
            list.add(stu);
        }
        JdbcUtil.close(rs, prep, conn);
        return list;
    }

    //添加多行
    public static void add(ArrayList<Stu> list) throws Exception {
        Connection conn = JdbcUtil.getConnection();
        String sql = "insert into stu (id,class_id,name,sex,age) values ";
        for (int i = 0; i < list.size(); i++) {
            sql += "(" + list.get(i).getId() +
                    "," + list.get(i).getClassId() +
                    "," + "'" + list.get(i).getName() + "'" +
                    "," + "'" + list.get(i).getSex() + "'" +
                    "," + list.get(i).getAge() +
                    "),";
        }
        sql = sql.substring(0, sql.length() - 1);
        System.out.println(sql);
        PreparedStatement prep = conn.prepareStatement(sql);
        int rs = prep.executeUpdate();
        if (rs > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
        JdbcUtil.close(prep, conn);
    }

    //分页查询
    public static ArrayList<Stu> select(Integer page) {
        ArrayList<Stu> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        try {
            Page page1 = new Page();
            Integer pageSize = page1.getPageSize();
            conn = JdbcUtil.getConnection();
            String sql = "select * from stu limit ?,?";
            prep = conn.prepareStatement(sql);
            prep.setInt(1, pageSize);
            prep.setInt(2, page);
            rs = prep.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int classId = rs.getInt("class_id");
                String sname = rs.getString("name");
                String sex = rs.getString("sex");
                int age = rs.getInt("age");
                Stu stu = new Stu();
                stu.setId(id);
                stu.setClassId(classId);
                stu.setName(sname);
                stu.setSex(sex);
                stu.setAge(age);
                list.add(stu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, prep, conn);
        }
        return list;
    }
}
