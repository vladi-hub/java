package com.sf.model.claim;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.sf.actions.*;
import com.sf.model.*;

@Entity
@View(name = "GoInsClaim"
	, members = "goins;"
+ "startdate;"
+ "client;"
+ "explanation;"
)
public class GoInsClaim {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 20)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@DescriptionsList(descriptionProperties = "policyNo")
	@JoinColumn(name = "goid", insertable = false, updatable = false)
	@Required
	@OnChange(OnChangeCustomerNameActionGOIns.class)
	private GoIns goins;

	@Required
	private Date startdate;

	@ReadOnly
	@Required
	public String client;

	@Stereotype("MEMO")
	private String explanation;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public GoIns getGoins() {
		return goins;
	}
	public void setGoins(GoIns goins) {
		this.goins = goins;
	}

	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}

	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

}