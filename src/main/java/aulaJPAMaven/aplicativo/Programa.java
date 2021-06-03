package aulaJPAMaven.aplicativo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulaJPAMaven.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
//		 Pessoa p1 = new Pessoa(null, "Marceli lauxen", "celilauxen@gmail.com"); 
//		 Pessoa p2 =new Pessoa(null, "Lorenzo Lauxen de andrade", "lrmz.lauxen@gmail.com"); 
//		 Pessoa p3 = new Pessoa(null, "Samoel Maciel de andrade", "samoelmandrade@gmail.com");
		 
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		Pessoa p = em.find(Pessoa.class,5);
//		
//		em.remove(p);
		System.out.println("Nome: "+ p.getName() + " Email: "+p.getEmail() );
		
//		 em.getTransaction().begin();
//		 em.getTransaction().commit();
				
		em.close();
		emf.close();
		
//		System.out.println("Terminou");
		
	}

}
