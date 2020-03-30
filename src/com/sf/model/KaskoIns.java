package com.sf.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.sf.model.base.*;
import com.sf.model.crm.*;

@Entity
@View(name="Kasko",members=
"customer;" +
" Date ["+
"  signdate, startdate;"+
"];"+
"insobject;"+
"policyNo;" +
"driverAge;"+
"plateSource;"+
"vehicleType;"+		
"useType;" +
"ownageType;"+
"carYears;"+
"document;"+
"Price ["+
"listprice, brokerprice, discount;" +
"];" 
)
public class KaskoIns {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=9)
	private Long id;
	
	@Required
	@Column (length=20)
	private String policyNo;
	
	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	
	@Column(length=9)
	@Required
	private int driverAge;
	
	public int getDriverAge() {
		return driverAge;
	}

	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	@JoinColumn(name="custid", insertable = true, updatable = true)
    @Required
    private Customer customer;
 
    public Customer getCustomer() {
        return customer;
    }
 
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	@ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	@JoinColumn(name="psid", insertable = true, updatable = true)
	@Required
    private PlateSource plateSource;
 
    public PlateSource getPlateSource() {
        return plateSource;
    }
 
    public void setPlateSource(PlateSource plate) {
        this.plateSource = plate;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	@JoinColumn(name="vtid", insertable = true, updatable = true)
    @Required
    private VehicleType vehicleType;
 
    public VehicleType getVehicleType() {
        return vehicleType;
    }
 
    public void setVehicleType(VehicleType vType) {
        this.vehicleType = vType;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long number) {
		this.id = number;
	}
    
    @ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	@JoinColumn(name="utid", insertable = true, updatable = true)
    @Required
    private UsageType useType;
 
    public UsageType getUseType() {
        return useType;
    }
 
    public void setUseType(UsageType useType) {
        this.useType = useType;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	@JoinColumn(name="otid", insertable = true, updatable = true)
    @Required
    private OwnageType ownageType;
 
    public OwnageType getOwnageType() {
        return ownageType;
    }
 
    public void setOwnageType(OwnageType ownType) {
        this.ownageType = ownType;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList
	@JoinColumn(name="cyid", insertable = true, updatable = true)
    @Required
    private CarAge carAge;
 
    public CarAge getCarAge() {
        return carAge;
    }
 
    public void setCarAge(CarAge carAge) {
        this.carAge = carAge;
    }
    
    @Required
    @Stereotype("MONEY") 
    private float listprice;
    
    @Required
    @Stereotype("MONEY") 
    private float brokerprice;
    
    
    private float discount;
    
    public void setListPrice(float listprice){
    	this.listprice = listprice;
    }
    
    public float getListprice(){
    	return listprice;
    }

	public float getBrokerprice() {
		return brokerprice;
	}

	public void setBrokerprice(float brokerprice) {
		this.brokerprice = brokerprice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public void setListprice(float listprice) {
		this.listprice = listprice;
	}
	
	@Stereotype("MEMO") 
	private String insobject;

	public String getInsobject() {
		return insobject;
	}

	public void setInsobject(String insobject) {
		this.insobject = insobject;
	}
	
	@Required
	private Date startdate;
	
	@Required
	private Date signdate;

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getSigndate() {
		return signdate;
	}

	public void setSigndate(Date signdate) {
		this.signdate = signdate;
	}
	
	@Stereotype("FILE")
	@Column(length=32)
	private String document;

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}
}