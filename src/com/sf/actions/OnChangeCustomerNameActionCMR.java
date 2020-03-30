package com.sf.actions;

import org.openxava.actions.*;
import org.openxava.jpa.*;

import com.sf.model.*;
import com.sf.model.claim.*;

public class OnChangeCustomerNameActionCMR extends OnChangePropertyBaseAction {

	public void execute() throws Exception {
		Object o = getNewValue();
		if (o == null)
			return;

		Long value = (Long) o;

		Cmr cmr = XPersistence.getManager().find(Cmr.class, value);

		getView().setValue("client", cmr.getCustomer().getName());
	}
}