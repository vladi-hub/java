package com.sf.model.claim;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.sf.actions.*;
import com.sf.model.*;

@Entity
@Table(
	name="cmr_claim"
//	, uniqueConstraints = @UniqueConstraint(name="art_number_unq", columnNames={"art_number"})
)
@View(name = "CmrClaim"
, members = 
  "cmr;"
+ "startDate;"
+ "client;"
+ "description;")
public class CmrClaim {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 20)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@DescriptionsList(descriptionProperties="name, policyNo, startDate", order="${id} DESC") @NoCreate @NoModify
	@JoinColumn(name = "cmr_id", insertable = true, updatable = true)
	@Required
	@OnChange(OnChangeCustomerNameActionCMR.class)
	private Cmr cmr;

	@Required
	@Column(name="start_date")
	private Date startDate;

	@ReadOnly
	public String client;

	@Stereotype("MEMO")
	private String description;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Cmr getCmr() {
		return cmr;
	}
	public void setCmr(Cmr cmr) {
		this.cmr = cmr;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}