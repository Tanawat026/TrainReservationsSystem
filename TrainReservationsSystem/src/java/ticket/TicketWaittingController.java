/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import hiber.Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Filmm
 */
@WebServlet(name = "TicketWaittingController", urlPatterns = {"/TicketWaittingController"})
public class TicketWaittingController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession(true);
            //Data for Ticketinfo
            int psgId = Integer.parseInt(request.getParameter("psgId"));
            int trainTravelId = Integer.parseInt(request.getParameter("trainTravelId"));
            String departuredate = request.getParameter("departuredate");
            String status = "Waittng";
            int psgQuantity = 1;
            int price = Integer.parseInt(request.getParameter("price"));
            //Data for Show TicketDetail
            String trainname = request.getParameter("trainname");
            String fromlocation = request.getParameter("fromlocation");
            String tolocation = request.getParameter("tolocation");
            String departuretime = request.getParameter("departuretime");
            String arrivaltime = request.getParameter("arrivaltime");
            String availableseat = request.getParameter("availableseat");
             Service service = new Service();
            int ticketId = service.getAllTicketinfo() + 1;
            //Session for TicketInfo
            session.setAttribute("ticketId", ticketId);
            session.setAttribute("psgId", psgId);
            session.setAttribute("trainTravelId", trainTravelId);
            session.setAttribute("departuredate", departuredate);
            session.setAttribute("status", status);
            session.setAttribute("psgQuantity", psgQuantity);
            session.setAttribute("price", price);
            //Session for Show TicketDetail
            session.setAttribute("trainname", trainname);
            session.setAttribute("fromlocation", fromlocation);
            session.setAttribute("tolocation", tolocation);
            session.setAttribute("departuretime", departuretime);
            session.setAttribute("arrivaltime", arrivaltime);

            RequestDispatcher rd = request.getRequestDispatcher("PaymentTicket.jsp");
            rd.forward(request, response);

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
        processRequest(request, response);
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
        processRequest(request, response);
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
