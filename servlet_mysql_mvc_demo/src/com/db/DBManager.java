package com.db;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
/* ���ݿ����ӳص����������࣬�����������Ӷ���  */
public class DBManager {

	private static DataSource ds = null;// ��������Դ����

	public static DataSource getDataSource() throws Exception// ��xml�л�ȡ����Դ�ĵĺ���
	{

		if (null == ds) {
			Context initContext = new InitialContext();// �����ĳ�ʼ��
			if (null == initContext) {
				throw new Exception("No Context");
			}
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("sysdemo");// ��ȡ����Դ����
		}

		return (ds);
	}

	/* ��ȡ���ݿ����ӳ����Ӷ����� */

	public static Connection getConnection() {
		try {
			Connection conn = getDataSource().getConnection();// ��xml���õ����ݿ����ӳػ�ȡ����
			if (null != conn) {
				return (conn);// ���������ݿ����ӳص����Ӳ�����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
