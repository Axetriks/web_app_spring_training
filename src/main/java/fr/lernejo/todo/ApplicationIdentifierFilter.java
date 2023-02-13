package fr.lernejo.todo;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class ApplicationIdentifierFilter implements javax.servlet.Filter {
    public final String uuid;

    public ApplicationIdentifierFilter(){
        this.uuid = UUID.randomUUID().toString();
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
            HttpServletResponse rep = (HttpServletResponse)response;
            rep.setHeader("Instance-Id", this.uuid);
            chain.doFilter(request, rep);
    }
}
