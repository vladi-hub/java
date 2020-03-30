package com.sf.model.crm;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(
	  name="customer_type"
	, uniqueConstraints = @UniqueConstraint(name="customer_type_name_unq", columnNames={"name"})
)
@View(members = "name;")
public class CustomerType {

	@Id
	@Hidden // The property is not shown to the user. It's an internal identifier
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 20)
	private Long id;

	@Column(length = 40)
	@Required
	private String name;


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

	public String toString() {
		return name;
	}
}