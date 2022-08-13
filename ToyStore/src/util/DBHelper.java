package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Design pattern: Singleton
//Không sửa file này
public class DBHelper {
	
	private static DBHelper instance = null;
	private Connection connection = null;
	private String user;
	private String password;
	private String dbName;
	
	private DBHelper() {
		//để private để khóa không cho tạo đối tượng
		this.user = Config.USER;
		this.password = Config.PASSWORD;
		this.dbName = Config.DB_NAME;
	}
	
	private DBHelper(String user, String password, String dbName) {
		super();
		this.user = user;
		this.password = password;
		this.dbName = dbName;
	}
	
	private static String createConnectURL(String user,String password,String database) {
		String url = String.format(
				"jdbc:sqlserver://localhost:1433;databaseName=%s;user=%s;password=%s;encrypt=true;trustServerCertificate=true;",
				database,user,password);
		return url;
	}
	
	public synchronized static DBHelper getDefaultInstance() {
		if(instance == null)
			instance = new DBHelper();
		return instance;
	}
	
	public DBHelper getInstance(String user, String password, String dbname) {
		return new DBHelper(user, password, dbname);
	}
	
	public Connection getConnection() throws SQLException{
		if(this.connection == null || this.connection.isClosed())
			this.connection = DriverManager.getConnection(createConnectURL(user, password, dbName));
		return this.connection;
	}
}
