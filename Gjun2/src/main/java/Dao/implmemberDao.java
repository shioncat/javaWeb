package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface implmemberDao {
	//新增
	void add(Object o);
	
	//查詢
	Object queryId(int id);
	List<Object> queryAll();
	List<Object> query(String username,String password);
	List<Object> query(String username);
	//修改
	void update(Object o);
	
	
	//刪除
	
	void deleteId(int id);

}