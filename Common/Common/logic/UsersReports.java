package logic;

import java.io.Serializable;

public class UsersReports implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int report_id;
	private String month,year,data;
	
	public UsersReports() {
	
	}
	
	public UsersReports(int report_id, String month, String year, String data) {
		super();
		this.report_id = report_id;
		this.month = month;
		this.year = year;
		this.data = data;
	}
	
	public int getReport_id() {
		return report_id;
	}
	
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "UsersReports [report_id=" + report_id + ", month=" + month + ", year=" + year + ", data=" + data + "]";
	}
}
