package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.db.DBManager;


public class BaseDAO
{

    protected Connection getConn()
    {
        Connection conn = DBManager.getConnection();
        return conn;
    }

    protected void closeConn(Connection conn, Statement stmt, ResultSet rs)
    {
    	//System.out.println("---����closeConn()----");
        if (null!=conn)
        {
            try
            {
                conn.close();
            }
            catch (SQLException e)
            {}
        }
        if (null!=stmt)
        {
            try
            {
                stmt.close();
            }
            catch (SQLException e)
            {}
        }
        if (null!=rs)
        {
            try
            {
                rs.close();
            }
            catch (SQLException e)
            {}
        }
    }

    protected void closeConn(Connection conn, PreparedStatement pstmt, ResultSet rs)
    {
    	//System.out.println("---����closeConn()----");
        if (null!=conn)
        {
            try
            {
                conn.close();
            }
            catch (SQLException e)
            {}
        }
        if (null!=pstmt)
        {
            try
            {
                pstmt.close();
            }
            catch (SQLException e)
            {}
        }
        if (null!=rs)
        {
            try
            {
                rs.close();
            }
            catch (SQLException e)
            {}
        }
    }
    

	public void Closeconn(Connection conn) {
		try {
			if (null != conn) {
				conn.close();
			}
		} catch (Exception sqle) {
			//System.out.println("�ر����ݿ�����ʱ�����쳣" + sqle);
		}
	}
}
