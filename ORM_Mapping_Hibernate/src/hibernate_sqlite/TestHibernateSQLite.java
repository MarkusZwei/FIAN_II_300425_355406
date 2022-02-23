package hibernate_sqlite;

import java.util.logging.Level;

import org.hibernate.Session;

public class TestHibernateSQLite {
	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
	    Session session = HibernateUtilSQLite.getSessionFactory().openSession();
	    session.beginTransaction();

	    PersonEntitySQlite p1 = session.find(PersonEntitySQlite.class, 1);
	    System.out.println(p1);

	    PersonEntitySQlite p2 = new PersonEntitySQlite();
	    p2.setVorname("Christa");
	    p2.setNachname("Musterfrau");
	    session.save(p2);

	    session.getTransaction().commit();
	    HibernateUtilSQLite.shutdown();
	  }
}
