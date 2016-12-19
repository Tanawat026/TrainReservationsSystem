/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import hiber.Payment;
import hiber.Service;
import hiber.Ticketinfo;
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
@WebServlet(name = "TicketAddController", urlPatterns = {"/TicketAddController"})
public class TicketAddController extends HttpServlet {

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
            HttpSession session = request.getSession(true);
            Service service = new Service();
            int ticketID = service.getAllTicketinfo() + 1;
            int psgId = Integer.parseInt(request.getParameter("psgId"));
            int trainTravelId = Integer.parseInt(request.getParameter("trainTravelId"));
            String departureDate = request.getParameter("departuredate");
            String status = "Seccess ..";
            int psgQuantity = 1;
            int price = Integer.parseInt(request.getParameter("priceall"));
           
            //Data for Payment
            String paymentid = (service.getAllPayment()+1)+"";
            String ticketId = service.getAllTicketinfo() + 1+"";
            String cardname = request.getParameter("cardname");
            String cardnumber = request.getParameter("cardnumber");
            String expmonth = request.getParameter("expmonth");
            String expyear = request.getParameter("expyear");
            
            System.out.println("TicketID : "+ticketID+"Psg ID: "+psgId+"Traintralvel ID :"+trainTravelId+" ---- "+departureDate+status+psgQuantity+price+"<-------------------------------------");
            System.out.println(paymentid+ticketId+cardname+cardnumber+expmonth+expyear+"<-------------------------------------");
            //insert ticketinfo 
            Ticketinfo ticketinfo = new Ticketinfo(ticketID, psgId, trainTravelId, departureDate, status, psgQuantity, price);
            boolean saved = service.insertTicketInfo(ticketinfo);
            out.println(saved);
            //insert payment
            Payment payment = new Payment(paymentid,ticketId,cardname,cardnumber,expmonth,expyear);
            boolean saved2 = service.insertPaymentl(payment);
           // out.println(saved2);
            
            RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
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
