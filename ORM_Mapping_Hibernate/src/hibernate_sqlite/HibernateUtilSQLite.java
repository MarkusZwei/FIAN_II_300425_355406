package hibernate_sqlite;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilSQLite {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
//            return new Configuration().configure(new File(HibernateUtil.class.getResource("Config/hibernate.cgf.xml").toURI())).buildSessionFactory();
			return new Configuration().configure(new File(
					"C:\\Unterricht\\Workspaces_Unterricht\\FIAN_II_300425_355406\\ORM_Mapping_Hibernate\\Config\\hibernate_sqlite.cfg.xml"))
					.buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}