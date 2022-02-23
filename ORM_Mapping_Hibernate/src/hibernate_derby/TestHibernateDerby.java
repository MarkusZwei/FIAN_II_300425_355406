package hibernate_derby;

import java.util.logging.Level;

import org.hibernate.Session;

public class TestHibernateDerby {
	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
	    Session session = HibernateUtilDerby.getSessionFactory().openSession();
//	    session.beginTransaction();

	    PersonEntityDerby p1 = session.find(PersonEntityDerby.class, 2);
	    System.out.println(p1);
//	    session.getTransaction().commit();
	    HibernateUtilDerby.shutdown();
	  }
}
