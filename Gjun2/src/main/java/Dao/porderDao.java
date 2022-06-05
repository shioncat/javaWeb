package Dao;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Model.member;
import Model.porder;

public class porderDao implements implporderDao{

	public static void main(String[] args) {
		
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
	public List<Object> queryAll() {
		EntityManager em=DbConnection.getDb();
		String JQL="select p from porder p";
		Query q=em.createQuery(JQL);
		List l=q.getResultList();
		return l;
	}

	@Override
	public List<Object> querySum(int start, int end) {
		EntityManager em=DbConnection.getDb();
		String JQL="select p from porder p where p.sum>=?1 and p.sum<=?2";
		Query q=em.createQuery(JQL);
		q.setParameter(1, start);
		q.setParameter(2, end);
		
		List l=q.getResultList();
		return l;
	}

	@Override
	public Object queryId(int id) {
		EntityManager em=DbConnection.getDb();
		porder p=em.find(porder.class, id);
		
		return p;
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
	public void delete(int id) {
		EntityManager em=DbConnection.getDb();
		porder p=em.find(porder.class, id);
		
		EntityTransaction t=em.getTransaction();
		t.begin();
		em.remove(p);
		t.commit();
		em.close();
		
		
	}

}