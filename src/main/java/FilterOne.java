import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * Created by dkuzmich on 3/30/2017.
 */

//@WebFilter(filterName = "FilterOne", urlPatterns = "/")
public class FilterOne implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       // System.out.println("Inside filter one");
        String adr=servletRequest.getRemoteAddr();
       // System.out.println("REmote add= "+adr);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
