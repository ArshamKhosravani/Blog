package com.bahar;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "loginFilter", urlPatterns = "/login")
public class loginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws ServletException, IOException {
        PrintWriter out= resp.getWriter();
        String username  =req.getParameter("username");
         String password=req.getParameter("password");

         if(username.equals("alex")&& password.equals("45678")){
        chain.doFilter(req, resp);}
         else{
             out.write("<p>These username & password are not correct. !!!!</p>");
             RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
             requestDispatcher.include(req,resp);
         }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
