package com.sf.model.crm;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@View(name = "Customer", members = 
  "name;" 
+ "customerType;"
+ "address;"
+ "phones;"
+ "eik;"
+ "focalname;"
+ "email;")
public class Customer {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 20)
	private Long id;

	@Column(length = 40)
	private String name;

	@ManyToOne(fetch = FetchType.EAGER) // old: LAZY
	@DescriptionsList
	@JoinColumn(name = "customer_type_id", insertable = true, updatable = true)
	private CustomerType customerType;

	@Column(length = 200)
	private String address;

	@Column(length = 20)
	@Stereotype("TELEPHONE")
	private String phones;

	@Column(length = 12)
	private String eik;

	@Column(name="focal_name", length = 50)
	private String focalname;

	@Column(length = 50)
	@Stereotype("EMAIL")
	private String email;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType type) {
		this.customerType = type;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhones() {
		return phones;
	}
	public void setPhones(String phones) {
		this.phones = phones;
	}

	public String getEik() {
		return eik;
	}
	public void setEik(String eik) {
		this.eik = eik;
	}

	public String getFocalname() {
		return focalname;
	}
	public void setFocalname(String focalname) {
		this.focalname = focalname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}