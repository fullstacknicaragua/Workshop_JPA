package servicio;

import java.util.List;

public interface DAO {
	
	public <T> List<T> getListNameQuery(Class<T> clazz, String nameQuery, Object ...parametros);
	
	public <T> void createEntity(T t);
}
