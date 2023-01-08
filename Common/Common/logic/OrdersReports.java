package logic;

import java.io.Serializable;

public class OrdersReports implements Serializable
{

	
	private static final long serialVersionUID = 1L;
	private String report_id,machine_id,location,data,month,year;
	
	public OrdersReports()
	{
		
	}
	public OrdersReports(String report_id, String machine_id, String location, String data, String month, String year) {
		
		this.report_id = report_id;
		this.machine_id = machine_id;
		this.location = location;
		this.data = data;
		this.month = month;
		this.year = year;
	}
	public String getReport_id() {
		return report_id;
	}
	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}
	public String getMachine_id() {
		return machine_id;
	}
	public void setMachine_id(String machine_id) {
		this.machine_id = machine_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	@Override
	public String toString() {
		return "OrdersReports [report_id=" + report_id + ", machine_id=" + machine_id + ", location=" + location
				+ ", data=" + data + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
