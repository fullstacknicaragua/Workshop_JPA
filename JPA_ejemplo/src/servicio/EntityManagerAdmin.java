package servicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerAdmin {
	
	private static EntityManagerAdmin instancia = new EntityManagerAdmin();
	private static final String UNIDAD_PERSISTENCIA = "JPA_ejemplo";
	
	private EntityManagerAdmin() {}
	
	
	public static EntityManagerAdmin getInstancia() {
		return instancia;
	}
	
	public EntityManager getEntityManager() {		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(UNIDAD_PERSISTENCIA);
		EntityManager em = emf.createEntityManager();
		return em;		
	}

}
