package com.sf.model.base;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(
	  name="vehicle_type"
	, uniqueConstraints = @UniqueConstraint(name="vehicle_type_name_unq", columnNames={"name"})
)
@View(members = "name;")
@Tab(defaultOrder="${id} ASC")
public class VehicleType {
	// Typ na prevoznoto sredstvo

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