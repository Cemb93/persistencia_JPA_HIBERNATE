// VERSION 2
package cm.jpa.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import cm.jpa.dao.ProductoDao;
import cm.jpa.modelo.Producto;
import cm.jpa.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto celular = new Producto();
		celular.setNombre("sansung");
		celular.setDescripcion("tele usado");
		celular.setPrecio(new BigDecimal("1000"));

		EntityManager em = JPAUtils.getEntityManager();
		
		ProductoDao productoDao = new ProductoDao(em);
		
		em.getTransaction().begin();
		
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