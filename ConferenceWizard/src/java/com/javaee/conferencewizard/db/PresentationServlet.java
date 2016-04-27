/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ngoc
 */
public class PresentationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PresentationServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PresentationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/PresentationMaint.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String function = request.getParameter("function");

        Presentation presentation = new Presentation();
        try {
            String startString = request.getParameter("startTime");
            DateFormat format = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm", Locale.ENGLISH);
            Date date = format.parse(startString);
            presentation.setStartTime(date);
            String endString = request.getParameter("endTime");
            date = format.parse(endString);
            presentation.setEndTime(date);
            String idString = request.getParameter("presentationId");
            presentation.setPresentationId(Long.parseLong(idString));
            

        } catch (Exception e) {
            System.out.println("Date problem: " + e);
        }
        presentation.setTitle(request.getParameter("title"));
        
        switch (function) {
            case "A":
                presentation.add();
                break;
            case "U":
                presentation.change();
                break;
            case "D":
                presentation.delete();
                break;
            case "R":
                presentation = Presentation.read(presentation.getTitle());
                break;
        }
        DateFormat format = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm", Locale.ENGLISH);
        request.setAttribute("presentation", presentation);
        try {
        request.setAttribute("prettyStart", format.format(presentation.getStartTime()));
        request.setAttribute("prettyEnd", format.format(presentation.getEndTime()));
        } catch(Exception e) { System.out.println("Problem parsing dates"); }
        getServletContext().getRequestDispatcher("/PresentationMaint.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
