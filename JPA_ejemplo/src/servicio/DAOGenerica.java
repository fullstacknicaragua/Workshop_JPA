package servicio;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class DAOGenerica implements DAO{
	
	private Logger logger;

	@Override
	public <T> List<T> getListNameQuery(Class<T> clazz, String nameQuery, Object... parametros) {
	    EntityManager em = EntityManagerAdmin.getInstancia().getEntityManager();
	    try {
	    	TypedQuery<T> query = em.createNamedQuery(nameQuery,clazz);
	    	if (parametros != null) {
	    		for (int i=0;i<parametros.length;i++) {
	    			logger.info("Parametros." + parametros[i]);
	    			query.setParameter(i+1, parametros[i]);
	    		}	    		
	    	}
	    	List<T> lista = query.getResultList();
	    	return lista;
	    }	    
	    catch(NoResultException e) {
	    	logger.info("sin resultado:" +  nameQuery);
	    	return null;
	    }
	    catch(Exception e) {
	    	logger.info("error :" +  e.getCause().getMessage());
	    	return null;
	    }
	    finally {
	    	em.close();
	    }
		
	}

	@Override
	public <T> void createEntity(T t) {
		EntityManager em = EntityManagerAdmin.getInstancia().getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(t);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			logger.info("error :" +  e.getCause().getMessage());
		}
		finally {
			em.close();
		}
	}

	
	
	

}
