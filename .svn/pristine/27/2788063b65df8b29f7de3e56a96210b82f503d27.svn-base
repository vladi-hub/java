package com.sf.quartz.scheduler;

public class InsuranceDataBean {
	
	private long id;
	private String enddate;
	private String type;
	private String policyNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
	public String toString(String type){
		StringBuffer sb = new StringBuffer();
		sb.append("Insruance is about to expire in ONE ");
		sb.append(type);
		sb.append(" ID = ").append(id).append(", type = ").append(type).append(", enddate = ").
		append(enddate).append(", policy number = ").append(policyNo);
		sb.append("\r\n");
		return sb.toString();
	}

}
