package musikshop.model.interfaces;

import java.sql.ResultSet;

public interface DBConnection {
	ResultSet getAllArticles() throws Exception;
}
