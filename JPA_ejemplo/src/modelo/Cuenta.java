package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Table(name="cuenta")
@Getter
@Setter
@NamedQueries({
	@NamedQuery(name="Cuenta.findAll",query="select e from Cuenta e")
})
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private String nombre;
	
	private String apellido;

}
