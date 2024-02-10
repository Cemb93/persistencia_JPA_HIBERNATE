package cm.jpa.dao;

import javax.persistence.EntityManager;

import cm.jpa.modelo.Producto;

public class ProductoDao {
	private EntityManager em;

	public ProductoDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Producto producto) {
		this.em.persist(producto);
	}

}
