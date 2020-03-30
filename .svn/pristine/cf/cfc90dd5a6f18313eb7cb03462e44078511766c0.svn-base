-- Base package tables - begin
CREATE TABLE car_age (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE engine_volume (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE ownage_type (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE plate_source (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE registration_city (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE usage_type (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE vehicle_type (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;
-- Base package tables - end


-- OpenXava table - begin
CREATE TABLE IMAGES (
	id VARCHAR(255) NOT NULL,
	gallery VARCHAR(255),
	image TINYBLOB,

	PRIMARY KEY (id)
) ENGINE=InnoDB;
-- OpenXava table - end


-- CRM - begin
CREATE TABLE customer_type (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE customer (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),
	customer_type_id BIGINT,
	address VARCHAR(200),
	phones VARCHAR(20),
	eik VARCHAR(12),
	focal_name VARCHAR(50),
	email VARCHAR(50),

	PRIMARY KEY (id),
	CONSTRAINT fk_customer__customer_type FOREIGN KEY (customer_type_id) REFERENCES customer_type(id)
) ENGINE=InnoDB;
-- CRM - end


-- Insurance
CREATE TABLE cmr (
	id BIGINT NOT NULL auto_increment,
	name VARCHAR(40),
	start_date datetime,
	sign_date datetime,
	list_price DECIMAL(10 , 2),
	broker_price DECIMAL(10 , 2),

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE cmr_claim (
	id BIGINT NOT NULL auto_increment,
	cmr_id bigint,
	client varchar(255),
	description varchar(255),
	start_date datetime,

	primary key (id),
	CONSTRAINT fk_cmr_claim__cmr FOREIGN KEY (cmr_id) REFERENCES cmr(id)
) ENGINE=InnoDB;

CREATE TABLE GOIns (
	id BIGINT NOT NULL auto_increment,
	driverAge INT,
	cyid BIGINT,
	dyid BIGINT,
	evid BIGINT,
	otid BIGINT,
	psid BIGINT,
	rcid BIGINT,
	utid BIGINT,
	vtid BIGINT,

	PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE KaskoIns (
	id BIGINT NOT NULL auto_increment,
	driverAge INT,
	cyid BIGINT,
	otid BIGINT,
	psid BIGINT,
	utid BIGINT,
	vtid BIGINT,

	PRIMARY KEY (id)
) ENGINE=InnoDB;



-- @Trifon
-- This table do not have Model class!
-- CREATE TABLE driving_years (
--	id BIGINT NOT NULL auto_increment,
--	name VARCHAR(40),
-- 
--	PRIMARY KEY (id)
-- ) ENGINE=InnoDB;



-- CREATE TABLE product (
--	id BIGINT NOT NULL auto_increment,
--	description VARCHAR(40),
--	unit_price DECIMAL(10, 2),
--	ptid BIGINT,
--
--	PRIMARY KEY (id)
-- ) ENGINE=InnoDB;



-- CREATE INDEX FK_awonoopnc6n75vq3nmnt4hrd9 ON Product (id ASC);

CREATE INDEX FK_2pf7dydfaipfds3q5rmard8mf ON KaskoIns (cyid ASC);
CREATE INDEX FK_lb0men9q6snofrya2ecyct4kb ON KaskoIns (otid ASC);
CREATE INDEX FK_9xwfmh5isyhmdf2qbohhwi0h3 ON KaskoIns (utid ASC);
CREATE INDEX FK_i4tubxg7t98fmey3tmualp4be ON KaskoIns (psid ASC);
CREATE INDEX FK_c4xsx6nws0np65yy9p5c68luf ON KaskoIns (vtid ASC);

CREATE INDEX FK_axljvk1olgi9cwvl2kanamidj ON GOIns (psid ASC);
CREATE INDEX FK_mv1l6emyn0hojrb4w2qkam45e ON GOIns (rcid ASC);
CREATE INDEX FK_f3puptf7jkayhvd8rfxfgrugw ON GOIns (otid ASC);
CREATE INDEX FK_l4jvtgdwu5jdo3myhoiet0jqn ON GOIns (vtid ASC);
CREATE INDEX FK_c1j66g9ijvkq4q1muv0cat27f ON GOIns (dyid ASC);
CREATE INDEX FK_t0ofeikkwefeadxhucogj3ao6 ON GOIns (cyid ASC);
CREATE INDEX FK_5mneqm52byh3kew1k5cptx42i ON GOIns (utid ASC);
CREATE INDEX FK_n6w6ovvuhb5v2urf9mvnqmisu ON GOIns (evid ASC);