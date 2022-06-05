package Dao;

import java.util.List;

public interface implporderDao {
		//新增
		void add(Object o);
	
		//查詢
		List<Object> queryAll();
		List<Object> querySum(int start,int end);
		Object queryId(int id);
		
		//修改
		void update(Object o);
		
		//刪除
		void delete(int id);
}