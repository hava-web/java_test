package model;

import java.sql.Date;
import java.text.NumberFormat;
import java.util.Locale;

public class Toy {
	// Thuộc tính: mã, id, tên, mô tả, giá, ngày nhập
	private String code;
	private long id;
	private String name;
	private String description;
	private double price;
	private Date reciptDate;
	
	public Toy() {
	}
	
	public Toy(String code, long id, String name, String description, double price, Date reciptDate) {
		super();
		this.code = code;
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.reciptDate = reciptDate;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getReciptDate() {
		return reciptDate;
	}
	
	public void setReciptDate(Date reciptDate) {
		this.reciptDate = reciptDate;
	} 
	
	@Override
	public String toString() {
		Locale locale = new Locale("vi", "VN");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
		
		return "Toy [id=" + id + ", code=" + code + ", name=" + name + ", price=" + fmt.format(price) + ", description="
        + description + ", receiptDate=" + reciptDate + "]";
	}
}
