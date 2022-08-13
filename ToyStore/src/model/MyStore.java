package model;

import util.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyStore implements Store{
	private String name;
	
	public MyStore(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void insertProduct(Toy item) throws Exception{
		Connection connection = DBHelper.getDefaultInstance().getConnection();
		Statement stmt = connection.createStatement();
		
		// Câu lệnh mẫu, chú ý thay thế your_table phù hợp
		// Lưu ý: xem phần tên cột có khớp không nhé, nếu ko khớp có thể điều chỉnh lại!
		String sql = String.format("INSERT INTO TOYS VALUES ('%d', '%s', N'%s', '%f', '%s', '%s')",1,
			item.getCode(),item.getName(),item.getPrice(),item.getDescription(),item.getReciptDate().toString());
		
		stmt.executeUpdate(sql);
		stmt.close();
	}
	
	@Override
	public Toy searchProductByCode(String code) throws Exception{
		Connection connection = DBHelper.getDefaultInstance().getConnection();
		Statement stmt = connection.createStatement();
		
		//Thêm câu lệnh còn thiếu tại đây
		String sql = String.format("SELECT * FROM TOYS WHERE code = '%s'",code);
		
		Toy item = null;
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			item = new Toy();
			//item.setId(rs.getLong("id"));
			item.setCode(rs.getString("code"));
			item.setName(rs.getNString("name"));
			item.setPrice(rs.getDouble("price"));
			item.setDescription(rs.getNString("description"));
			item.setReciptDate(rs.getDate("receiveDate"));
		}
		rs.close();
		stmt.close();
		return item;
	}
	
	@Override
	public List<Toy> orderByASC() throws Exception{
		Connection connection = DBHelper.getDefaultInstance().getConnection();
		Statement stmt = connection.createStatement();
		
		//Thêm câu lệnh còn thiếu tại đây
		String sql = "SELECT * FROM TOYS ODER BY price";
		
		ResultSet rs = stmt.executeQuery(sql);
		List<Toy> list = new ArrayList<Toy>();
		while(rs.next()) {
			Toy item = new Toy();
//			item.setId(rs.getLong("id"));
			item.setCode(rs.getString("code"));
			item.setName(rs.getNString("name"));
			item.setPrice(rs.getDouble("price"));
			item.setDescription(rs.getNString("description"));
			item.setReciptDate(rs.getDate("receiveDate"));
			list.add(item);
		}
		return list;
	}
	
	@Override
	public List<Toy> listExpiration() throws Exception{
		Connection connection = DBHelper.getDefaultInstance().getConnection();
		Statement stmt = connection.createStatement();
		
		//Thêm câu lệnh còn thiếu tại đây
		String sql ="SELECT * FROM TOYS WHERE DATEDIFF(year, receiptDate, CURRENT_TIMESTAMP ) >  1;GO";
		
		ResultSet rs = stmt.executeQuery(sql);
		List<Toy> list = new ArrayList<Toy>();
		while(rs.next()) {
			Toy item = new Toy();
			item.setId(rs.getLong("id"));
			item.setCode(rs.getString("code"));
			item.setName(rs.getNString("name"));
			item.setPrice(rs.getDouble("price"));
			item.setDescription(rs.getNString("description"));
			item.setReciptDate(rs.getDate("receiptDate"));
			list.add(item);
		}
		rs.close();
		stmt.close();
		return list;
	}
	
}