package com.kh;

import com.kh.util.Common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM EMP";
            rs = stmt.executeQuery(sql);

            System.out.println(rs);
            while(rs.next()) {
                System.out.println(rs.getInt("EMPNO") + " ");
                System.out.println(rs.getString("ENAME") + " ");
                System.out.println(rs.getString("JOB") + " ");
                System.out.println(rs.getInt("MGR") + " ");
                System.out.println(rs.getDate("HIREDATE") + " ");
                System.out.println(rs.getInt("SAL") + " ");
                System.out.println(rs.getInt("COMM") + " ");
                System.out.println(rs.getInt("DEPTNO") + " ");
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
