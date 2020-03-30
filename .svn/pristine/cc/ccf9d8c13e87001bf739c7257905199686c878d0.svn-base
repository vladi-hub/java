package org.openxava.action.report;

import java.util.*;

import javax.servlet.*;

import org.apache.commons.logging.*;
import org.openxava.actions.*;

import net.sf.jasperreports.engine.*;

public class ExtendedGenerateReportAction extends JasperReportBaseAction {

	private static Log log = LogFactory.getLog(ExtendedGenerateReportAction.class);

	private String jrxml = "products.jrxml"; // Value can be overwritten in xava/controllers.xml


	@Override
	protected JRDataSource getDataSource() throws Exception {
		return null;
	}

	@Override
	protected String getJRXML() {
		log.info("TRIFON - TEST - INFO log.");
		log.debug("TRIFON - TEST - DEBUG log.");
		log.error("TRIFON - TEST - ERROR log.");
		return jrxml;
	}
	public void setJrxml(String newJrxml) {
		jrxml = newJrxml;
	}

// @Trifon - BEGIN - control opening in new window from controllers.xml
	@Override
	public boolean inNewWindow() {
		return inNewWindow;
	}

	private boolean inNewWindow = true;
	public boolean isInNewWindow() {
		return inNewWindow;
	}
	public void setInNewWindow(boolean inNewWindow) {
		this.inNewWindow = inNewWindow;
	}
// @Trifon - END - control opening in new window from controllers.xml

	@Override
	public Map<String, Object> getParameters() throws Exception  { // 2
//		Messages errors = MapFacade.validate("FilterBySubfamily", getView().getValues());
//		if (errors.contains()) 
//			throw new ValidationException( errors );               // 3

		ServletContext servletContext = getRequest().getSession().getServletContext();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("SUBREPORT_DIR", servletContext.getRealPath("/WEB-INF/classes/") );
//		parameters.put("subreport_report", JasperCompileManager.compileReport(JRUtils.class.getResourceAsStream("/Project_products.jrxml")) );
/*
		parameters.put("year1", getView().getValue("year1") );
		parameters.put("month1", getView().getValue("month1") );
		if (getView().getValue("format") != null) {
			this.setFormat( getView().getValue("format").toString() );
		} else if (getFormat() != null) {
			//
		}
*/
		return parameters;
    }
}