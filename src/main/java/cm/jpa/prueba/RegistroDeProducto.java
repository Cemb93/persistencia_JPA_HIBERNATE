// VERSION 2
package cm.jpa.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import cm.jpa.dao.CategoriaDao;
import cm.jpa.dao.ProductoDao;
import cm.jpa.modelo.Categoria;
import cm.jpa.modelo.Producto;
import cm.jpa.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
		
//		Producto celular = new Producto("Samsung", "tele usado", new BigDecimal("2000"), Categoria.CELULARES);
		Producto celular = new Producto("Samsung", "tele usado", new BigDecimal("2000"), celulares);

		EntityManager em = JPAUtils.getEntityManager();
		
		ProductoDao productoDao = new ProductoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		categoriaDao.guardar(celulares);		
		productoDao.guardar(celular);
		
		em.getTransaction().commit();
		em.close();
	}

}

// VERSION 1
//package cm.jpa.prueba;
//
//import java.math.BigDecimal;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import cm.jpa.dao.ProductoDao;
//import cm.jpa.modelo.Producto;
//
//public class RegistroDeProducto {
//
//	public static void main(String[] args) {		
//		Producto celular = new Producto();
//		celular.setNombre("sansung");
//		celular.setDescripcion("tele usado");
//		celular.setPrecio(new BigDecimal("1000"));
//		
//		EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("persistencia-jpa-hibernate");
//		EntityManager em = FACTORY.createEntityManager();
//		
//		ProductoDao productoDao = new ProductoDao(em);
//		
//		em.getTransaction().begin();
//		
//		productoDao.guardar(celular);
//		
//		em.getTransaction().commit();
//		em.close();
//	}
//
//}