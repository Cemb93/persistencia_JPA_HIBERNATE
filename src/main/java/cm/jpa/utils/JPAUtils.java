package cm.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	private static EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("persistencia-jpa-hibernate");
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
}
