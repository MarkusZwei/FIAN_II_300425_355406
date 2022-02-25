package demo03_multiton;

import java.util.HashMap;

public class DemoMultiton {
	public static void main(String[] args) {
		var con1 = DBPoolConnection.getInstanz(1);
		var con2 = DBPoolConnection.getInstanz(2);
		
		
	}
}

class DBPoolConnection{
	private class DatabaseConnection {
		public DatabaseConnection(String typ) {

		}

		public void open() {
			System.out.println("Verbindung geoeffnet");
		}
	}	
	private DatabaseConnection dbConnection;
	
	private static HashMap<Integer, DBPoolConnection> instanzen = new HashMap<>();
	
	private DBPoolConnection() {
		this.dbConnection = new DatabaseConnection("Ein Connection String");
		this.dbConnection.open();
	}
	
	public static DBPoolConnection getInstanz(Integer key) {
		if(key>5) {
			throw new RuntimeException("Key darf nicht groesser 5 sein");
		}
		var instanz = instanzen.get(key);
		if(instanz == null) {
			instanz = new DBPoolConnection();
			instanzen.put(key, instanz);
		}
		return instanz;
	}
}


