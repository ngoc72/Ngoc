/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Welcome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Welcome.MyCookie;

/**
 *
 * @author Ngoc
 */
public class ServletPage extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String action = request.getParameter("action");
        String url = "/index.jsp";
        if (action==null){
            action = "viewPage";
        }
        if (action.equals("viewPage")){
            url = "/index.jsp";
        }
        else if (action.equals("createAcount")){
            url = "/register.jsp";
        }
        else if (action.equals("checkUser")){
            url = checkUser(request,response);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            String action = request.getParameter("action");
            if (action.equals("registerUser")){
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String email = request.getParameter("email");
                UserZ user = new UserZ(firstName, lastName, email);
                request.setAttribute("userz", user);
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                Cookie c = new Cookie("emailCookie",email);
                c.setMaxAge(60*60*24*365);
                c.setPath("/");
                response.addCookie(c);
            }
            String url = "/welcome.jsp";
            getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
        
    }
    

    private String checkUser(HttpServletRequest request, HttpServletResponse response) {
        String url="/index.jsp";
            String emailCookie = request.getParameter("email");
            
            HttpSession session = request.getSession();
           // session.setAttribute("emailCookie",emailCookie);
            UserZ user = (UserZ)session.getAttribute("user");
            
            if (user == null) {
                Cookie[] cookies = request.getCookies();
                String emailAddress = 
                    MyCookie.getCookieValue(cookies,emailCookie);

                
                if (emailAddress == null || emailAddress.equals("")) {
                    url = "/register.jsp";
                } 
                
                else {
                    
                    session.setAttribute("user", user);
                    url = "/welcome.jsp";
                }
            } 
            // if User object exists, go to Downloads page
            else {
                url = "/welcome.jsp";
        }
        return url;
               
    }
        
    
    }

    

   
    

