package helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
			
	Class [] x={Myconfigration.class};
	return x;
	}

	@Override
	protected String[] getServletMappings() {
		
		String [] b ={"/"};
		return b;
	}
 
	
}
