package name.trifon.log4j;

import javax.servlet.http.HttpServlet;

import org.apache.log4j.xml.DOMConfigurator;

//   How to enable Log4j ?
// - https://sourceforge.net/p/openxava/discussion/419690/thread/d1df1e74/
//
//   Logging in Tomcat
// - https://tomcat.apache.org/tomcat-6.0-doc/logging.html
public class Log4jInit extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		String prefix = getServletContext().getRealPath("/");
		String file = getInitParameter("log4j-init-file");

		// If the log4j-init-file is not set, then no point in trying
		if (file != null) {
			DOMConfigurator.configure(prefix + file);
		}
	}

}