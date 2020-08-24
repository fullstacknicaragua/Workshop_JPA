package modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Test")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test {
	
	@Id
	private Integer id;
	
	private String pregunta;
	
	private String observacion;

}
