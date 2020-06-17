package com.hzg.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;


public class OrderItem  implements Serializable{
private Integer autoID;
private String itemID;
private String cat;
private Double 	spec;
private String unit;
private Integer quantity;
private String saleprice;
private Double amount;
private String currency;
private String note;
private Date creatime;
private String orderID;
private String cass;
private String itemtype;
private String quoteID;
private String itemstatus;
private Integer aliquotneed;
private String packed;
private Double discountrate;
private String futurepush;
private Integer future;
private Date deliverydate;
private String futurestate;
private Integer xcode;
public Integer getAutoID() {
	return autoID;
}
public void setAutoID(Integer autoID) {
	this.autoID = autoID;
}
public String getItemID() {
	return itemID;
}
public void setItemID(String itemID) {
	this.itemID = itemID;
}
public String getCat() {
	return cat;
}
public void setCat(String cat) {
	this.cat = cat;
}
public Double getSpec() {
	return spec;
}
public void setSpec(Double spec) {
	this.spec = spec;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public String getSaleprice() {
	return saleprice;
}
public void setSaleprice(String saleprice) {
	this.saleprice = saleprice;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public Date getCreatime() {
	return creatime;
}
public void setCreatime(Date creatime) {
	this.creatime = creatime;
}
public String getOrderID() {
	return orderID;
}
public void setOrderID(String orderID) {
	this.orderID = orderID;
}
public String getCass() {
	return cass;
}
public void setCass(String cass) {
	this.cass = cass;
}
public String getItemtype() {
	return itemtype;
}
public void setItemtype(String itemtype) {
	this.itemtype = itemtype;
}
public String getQuoteID() {
	return quoteID;
}
public void setQuoteID(String quoteID) {
	this.quoteID = quoteID;
}
public String getItemstatus() {
	return itemstatus;
}
public void setItemstatus(String itemstatus) {
	this.itemstatus = itemstatus;
}
public Integer getAliquotneed() {
	return aliquotneed;
}
public void setAliquotneed(Integer aliquotneed) {
	this.aliquotneed = aliquotneed;
}
public String getPacked() {
	return packed;
}
public void setPacked(String packed) {
	this.packed = packed;
}
public Double getDiscountrate() {
	return discountrate;
}
public void setDiscountrate(Double discountrate) {
	this.discountrate = discountrate;
}
public String getFuturepush() {
	return futurepush;
}
public void setFuturepush(String futurepush) {
	this.futurepush = futurepush;
}
public Integer getFuture() {
	return future;
}
public void setFuture(Integer future) {
	this.future = future;
}
public Date getDeliverydate() {
	return deliverydate;
}
public void setDeliverydate(Date deliverydate) {
	this.deliverydate = deliverydate;
}
public String getFuturestate() {
	return futurestate;
}
public void setFuturestate(String futurestate) {
	this.futurestate = futurestate;
}
public Integer getXcode() {
	return xcode;
}
public void setXcode(Integer xcode) {
	this.xcode = xcode;
}
@Override
public String toString() {
	return "OrderItem [autoID=" + autoID + ", itemID=" + itemID + ", cat=" + cat + ", spec=" + spec + ", unit=" + unit
			+ ", quantity=" + quantity + ", saleprice=" + saleprice + ", amount=" + amount + ", currency=" + currency
			+ ", note=" + note + ", creatime=" + creatime + ", orderID=" + orderID + ", cass=" + cass + ", itemtype="
			+ itemtype + ", quoteID=" + quoteID + ", itemstatus=" + itemstatus + ", aliquotneed=" + aliquotneed
			+ ", packed=" + packed + ", discountrate=" + discountrate + ", futurepush=" + futurepush + ", future="
			+ future + ", deliverydate=" + deliverydate + ", futurestate=" + futurestate + ", xcode=" + xcode + "]";
}



}
