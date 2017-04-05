import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by dkuzmich on 3/30/2017.
 */
//@WebFilter(filterName ="FilterSecurity", urlPatterns = "/")
public class FilterSecurity implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String name=request.getParameter("firstname");
        // System.out.println("!!!!!Filter 2!!!!!!!!!");
      //  System.out.println("!!!!! You enter name = " +name);
        chain.doFilter(request,response);

    }

    public void destroy() {

    }
}
