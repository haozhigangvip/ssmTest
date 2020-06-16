package com.hzg.domain;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable{
	private Integer autoID;
	private String comID;
	private String companyname;
	private String comptype;
	private String comadrID;
	private String phone;
	private String abbre;
	private String note;
	private Date createtime;
	private String csalesman;
	private Integer delTag;
	public Integer getAutoID() {
		return autoID;
	}
	public void setAutoID(Integer autoID) {
		this.autoID = autoID;
	}
	public String getComID() {
		return comID;
	}
	public void setComID(String comID) {
		this.comID = comID;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getComptype() {
		return comptype;
	}
	public void setComptype(String comptype) {
		this.comptype = comptype;
	}
	public String getComadrID() {
		return comadrID;
	}
	public void setComadrID(String comadrID) {
		this.comadrID = comadrID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAbbre() {
		return abbre;
	}
	public void setAbbre(String abbre) {
		this.abbre = abbre;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getCsalesman() {
		return csalesman;
	}
	public void setCsalesman(String csalesman) {
		this.csalesman = csalesman;
	}
	public Integer getDelTag() {
		return delTag;
	}
	public void setDelTag(Integer delTag) {
		this.delTag = delTag;
	}
	@Override
	public String toString() {
		return "Order [autoID=" + autoID + ", comID=" + comID + ", companyname=" + companyname + ", comptype="
				+ comptype + ", comadrID=" + comadrID + ", phone=" + phone + ", abbre=" + abbre + ", note=" + note
				+ ", createtime=" + createtime + ", csalesman=" + csalesman + ", delTag=" + delTag + "]";
	}
	
	

}
