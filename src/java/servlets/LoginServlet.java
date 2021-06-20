/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;

/**
 *
 * @author 816386
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Capture the parameters from the POST request (the form)
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new User(username,password);
        request.setAttribute("user", user);
        
         // validation: if the parameters don't exist or are empty, show the form again
        if( username == null || username.equals("") || password == null || password.equals("")){
         
            request.setAttribute("invalid", true);
          
             response.sendRedirect("login");

        //getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
           // return;// Very important! Stop the code call.
        }
        
        if (username != null && username.equals("adam")){
                    response.sendRedirect("home");
        }
            else if ( username != null && username.equals("betty") ){
                            response.sendRedirect("home");
            }

          // display the helloWorld JSP
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }



}
