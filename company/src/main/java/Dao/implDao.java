package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface implDao {
	//連線方法java8 static
	static Connection getDB()
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/company_2022?useUnicode=true&amp;characterEncoding=UTF-8";
		String user="root";
		String password="1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	//C(create)新增會員物件
	void add(String name,String username,String password);
	void add(Object o);
	
	
	//R(read)查詢會員物件
	String queryAll();
	
	//U(update)修改物件
	void update(String name, int id);
	
	
	//D(delete)刪除物件
	void delete(int id);
}