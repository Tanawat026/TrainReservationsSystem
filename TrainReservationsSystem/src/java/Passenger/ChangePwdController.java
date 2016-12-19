/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Passenger;

import hiber.Passenger;
import hiber.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Span
 */
@WebServlet(name = "ChangePwdController", urlPatterns = {"/ChangePwdController"})
public class ChangePwdController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private boolean isOldPassword(Passenger owner, String oldpass) {
        return owner.getPassword().equals(oldpass);
    }

    private boolean isNotOldPassword(String oldpass, String newpass) {
        return !oldpass.equals(newpass);
    }

    private boolean isCorrectRewritePassword(String newpass, String repass) {
        return newpass.equals(repass);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession(true);
            List psg = (List) session.getAttribute("resultPsg");
            Passenger passenger = null;
            for (Object l : psg) {
                passenger = (Passenger) l;
            }
            String oldpass = request.getParameter("oldpass");
            String newpass = request.getParameter("newpass");
            String repass = request.getParameter("repass");
            /*out.println(isOldPassword(passenger, oldpass));
            out.println(isNotOldPassword(oldpass, newpass));
            out.println(isCorrectRewritePassword(newpass, repass));*/
            Service service = new Service();
            if (isOldPassword(passenger, oldpass)) {
                if (!newpass.equals("")) {
                    if (isNotOldPassword(oldpass, newpass)) {
                        if (isCorrectRewritePassword(newpass, repass)) {
                            passenger.setPassword(newpass);
                            boolean lastCondition = service.updatePasswordPassenger(passenger);
                            if (lastCondition) {
                                RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?update=true");
                                rd.forward(request, response);
                            } else {
                                RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?update=fail");
                                rd.forward(request, response);
                            }
                        }else{
                            RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?validate=isCorrectRewritePassword&requestChange=C!2ng99wd");
                        rd.forward(request, response);
                        }
                    }else{
                        RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?validate=newPasswordBlank&requestChange=C!2ng99wd");
                        rd.forward(request, response);
                    }
                }else{
                    RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?validate=newPasswordBlank&requestChange=C!2ng99wd");
                rd.forward(request, response);
                }
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?validate=isOldPassword&requestChange=C!2ng99wd");
                rd.forward(request, response);
            }
            /*RequestDispatcher rd = request.getRequestDispatcher("ProfilePage.jsp?cngpwd=yes");
            rd.forward(request, response);*/
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
