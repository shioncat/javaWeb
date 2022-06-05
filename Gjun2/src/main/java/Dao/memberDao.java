package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.member;

public class memberDao implements implmemberDao{

	public static void main(String[] args) {
		
		/*EntityManagerFactory emf=Persistence.createEntityManagerFactory("gjun");
		EntityManager em=emf.createEntityManager();
		EntityTransaction t=em.getTransaction();
		member m=new member("winds","1234","sherry", "台北", "0222700000", "0900123123");
		t.begin();
		em.persist(m);
		t.commit();
		em.close(); //新增一 */
		
		/*member m=new member("dora","aaa","444","高雄","0488888888","0988888888");
		new memberDao().add(m); //新增二 */
		
		/*member m=(member) new memberDao().queryId(1);
		System.out.println(m.getName()+"\t"+m.getUsername()); //查詢id 1資料 */
		
		//System.out.println(new memberDao().queryId(3)); //錯誤的查詢,這樣只會是記憶體位址
		
		/*member m=(member) new memberDao().queryId(1);
		m.setName("teacher");
		new memberDao().update(m); //修改 */
		
		/*new memberDao().deleteId(5); //刪除 */
		
		List<Object> m=new memberDao().queryAll();
		m.forEach(P->System.out.println(P));
		

	}

	@Override
	public void add(Object o) {
		EntityManager em=DbConnection.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.persist(o);
		t.commit();
		em.close();
		
	}

	@Override
	public Object queryId(int id) {
		EntityManager em=DbConnection.getDb();
		member m=em.find(member.class, id);
		return m;
	}

	@Override
	public void update(Object o) {
		EntityManager em=DbConnection.getDb();
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.merge(o);
		t.commit();
		em.close();
		
	}

	@Override
	public void deleteId(int id) {
		EntityManager em=DbConnection.getDb();
		//member m=(member) new memberDao().queryId(id);
		member m=em.find(member.class, id);
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.remove(m);
		t.commit();
		em.close();
		
		
	}

	@Override
	public List<Object> queryAll() {
		EntityManager em=DbConnection.getDb();
		String JQL="select e from member e";		
		Query q=em.createQuery(JQL);
		List l=q.getResultList();		
		return l;
	}

	@Override
	public List<Object> query(String username, String password) {
		EntityManager em=DbConnection.getDb();
		String JQL="select e from member e where e.username=?1 and e.password=?2";
		Query q=em.createQuery(JQL);
		q.setParameter(1, username);
		q.setParameter(2, password);		
		List l=q.getResultList();		
		return l;
	}

	@Override
	public List<Object> query(String username) {
		EntityManager em=DbConnection.getDb();
		String JQL="select e from member e where e.username=?1";
		Query q=em.createQuery(JQL);
		q.setParameter(1, username);
				
		List l=q.getResultList();		
		return l;
	}

}