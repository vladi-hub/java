package com.sf.actions;

import org.openxava.actions.*;
import org.openxava.jpa.*;

import com.sf.model.*;
 
/**
 * @author Javier Paniza
 */
public class OnChangeCustomerNameActionKaskoIns extends OnChangePropertyBaseAction { // 1
 
 public void execute() throws Exception {
	 Object o = getNewValue();
	 if ( o == null) return;
	 
	 Long value = (Long) o; // 2
	
	 KaskoIns c = XPersistence.getManager().find(KaskoIns.class, value);
	 
	 getView().setValue("client", c.getCustomer().getName()); // 3
 }
 
}
