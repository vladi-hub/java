package com.sf.model.claim;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.sf.actions.*;
import com.sf.model.*;

@Entity 
@View(name="KaskoInsClaim",members=
"kasko;" +
"startdate;"+
"client;"+
"explanation;"
)
public class KaskoInsClaim {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ptid",length=32)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList(descriptionProperties="policyNo")
	@JoinColumn(name="kaskoid", insertable = false, updatable = false)
    @Required
    @OnChange(OnChangeCustomerNameActionKaskoIns.class)
    private KaskoIns kasko;

    public KaskoIns getKasko() {
		return kasko;
	}

	public void setKasko(KaskoIns kasko) {
		this.kasko = kasko;
	}
    
    @Required
	private Date startdate;

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	
	@Stereotype("MEMO") 
	private String explanation;

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	@ReadOnly
	@Required
	public String client;

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
}
