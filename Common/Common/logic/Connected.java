package logic;

import java.io.Serializable;

public class Connected implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ip;
	private String Host;
	private String Status;
	
	public Connected(String ip, String Host, String Status) {
		this.ip = ip;
		this.Host = Host;
		this.Status = Status;
	}
	
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHost() {
		return Host;
	}

	public void setHost(String host) {
		Host = host;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	
	
     
}