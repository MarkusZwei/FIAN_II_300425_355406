package musikshop.model.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import musikshop.model.interfaces.DBConnection;

public class SQLiteConnection implements DBConnection {

	private static final String URL = "jdbc:sqlite:./DB/Musikshop.db";
	private Connection connection;

	private Connection getConnection() {
		return connection;
	}

	private void setConnection(Connection connection) {
		this.connection = connection;
	}

	public SQLiteConnection() {
		try {
			this.setConnection(DriverManager.getConnection(URL));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet getAllArticles() throws Exception {
		Statement stm = this.getConnection().createStatement();
		String sql = "SELECT * FROM artikel";
		ResultSet res = stm.executeQuery(sql);
		return res;

	}

}
