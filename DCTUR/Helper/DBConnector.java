package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    // Değerlendirme Formu 6: Database ile ilgili işlemler bu Class'da tanımlanmıştır. DB kullanıcı bilgileri ise config Class'ında mevcuttur.
    private Connection connect = null;

    public Connection connectDb(){
        try {
            this.connect = DriverManager.getConnection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.connect;
    }

    public static Connection getInstance(){
        DBConnector db = new DBConnector();
        return db.connectDb();
    }
}
