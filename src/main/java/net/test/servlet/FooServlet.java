package net.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.test.Foo;

@WebServlet("/foo")
public class FooServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        Foo foo = applicationContext.getBean(Foo.class);
        
        try {
            if(req.getParameter("userRequired") != null) {
                foo.userRequired();
            } else if (req.getParameter("godRequired") != null) {
                foo.godRequired();
            }
            
            resp.getWriter().write("<font color='green'>Success!</font>");
            
        } catch (Exception e) {
            resp.getWriter().write("<font color='red'>" + e.getMessage() + "</font>");
        }
    }
}
