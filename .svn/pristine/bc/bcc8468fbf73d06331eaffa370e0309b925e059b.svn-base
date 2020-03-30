package com.sf.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.sf.model.claim.*;
import com.sf.model.crm.*;

@Entity
@Views({
	@View( members = 
   "customer, name, policyNo; "
+ " Date [ signDate, startDate ] "
+ "insobject; "
+ " Price [ listPrice, brokerPrice, discount ] "
	)
	, @View( name = "Search", members = 
	"customer; name; policyNo; signDate; startDate; insobject; listPrice; brokerPrice; discount"
	)
})
public class Cmr {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 20)
	private Long id;

	@Column(length = 40)
	@Required
	private String name;

	@Required
	@Column(length = 20)
	private String policyNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@DescriptionsList(order = "${id} DESC")
	@JoinColumn(name = "customer_id", insertable = true, updatable = true)
	@Required
	private Customer customer;

	@Required
	@Column(name="start_date")
	private Date startDate;

	@Required
	@Column(name="sign_date")
	private Date signDate;

	@Stereotype("MONEY")
	@Column(name="list_price")
	private float listPrice;

	@Stereotype("MONEY")
	@Column(name="broker_price")
	private float brokerPrice;

	private float discount;

	@Stereotype("MEMO")
	private String insobject;

//	@ElementCollection
	// - http://stackoverflow.com/questions/11938253/jpa-joincolumn-vs-mappedby
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cmr")
	private List<CmrClaim> cmrClaims;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setListPrice(float listPrice) {
		this.listPrice = listPrice;
	}
	public float getListPrice() {
		return listPrice;
	}

	public float getBrokerPrice() {
		return brokerPrice;
	}
	public void setBrokerPrice(float brokerPrice) {
		this.brokerPrice = brokerPrice;
	}

	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getInsobject() {
		return insobject;
	}
	public void setInsobject(String insobject) {
		this.insobject = insobject;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getSignDate() {
		return signDate;
	}
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public List<CmrClaim> getCmrClaims() {
		return cmrClaims;
	}
	public void setCmrClaims(List<CmrClaim> cmrClaims) {
		this.cmrClaims = cmrClaims;
	}

	public String toString() {
		return name;
	}
}