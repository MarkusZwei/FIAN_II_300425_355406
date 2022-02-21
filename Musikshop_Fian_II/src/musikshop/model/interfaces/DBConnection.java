package musikshop.model.interfaces;

import java.sql.ResultSet;

public interface DBConnection {
	ResultSet getAllArticles() throws Exception;
	ResultSet getAllArticlesWithPictures() throws Exception;
	void addImageToDB(String encodedImage, int artikelId) throws Exception;
}
