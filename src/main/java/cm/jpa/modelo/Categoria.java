package cm.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	// SE CREA UN CONTRUCTOR SOLO PARA LA CATEGORIA
	public Categoria(String nombre) {
		this.nombre = nombre;
	}
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}


//VERSION 1 ENUM
//package cm.jpa.modelo;
//
//public enum Categoria {
//	
//	SOFTWARES,
//	LIBROS,
//	CELULARES,
//
//}
