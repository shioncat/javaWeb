package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {
	public static EntityManager getDb()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("gjun");
		EntityManager em=emf.createEntityManager();
		return em;
	}
}