package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.member;

public class memberDao implements implDao{

	public static void main(String[] args) {		
		
		member m=new member("巨匠","uu","1234");
		new memberDao().add(m);
		
	}

	@Override
	public void add(String name, String username, String password) {
		Connection conn=implDao.getDB();
		String sql="insert into member(name,username,password) values(?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, username);
			ps.setString(3, password);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void add(Object o) {
		Connection conn=implDao.getDB();
		String sql="insert into member(name,username,password) values(?,?,?)";
		member m=(member) o;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String queryAll() {
		Connection conn=implDao.getDB();
		String sql="select * from member";
		String show="";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				show=show+"<tr><td>"+rs.getInt("id")+
						"<td>"+rs.getString("name")+
						"<td>"+rs.getString("username")+
						"<td>"+rs.getString("password");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return show;
	}

	@Override
	public void update(String name, int id) {
		Connection conn=implDao.getDB();
		String sql="update member set name=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		Connection conn=implDao.getDB();
		String sql="delete from member where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}