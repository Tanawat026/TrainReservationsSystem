/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Filmm
 */
@WebServlet(name = "Service", urlPatterns = {"/Service"})
public class Service extends HttpServlet {

    public List getAuthentication(String username, String password) {
        Session session = null;
        Transaction tx = null;
        List passenger = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Passenger where username = '" + username + "' and password = '" + password + "'");
            passenger = query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return passenger;
    }
    
    public boolean updatePasswordPassenger(Passenger passenger) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            String hql = "UPDATE Passenger set password = :pass WHERE psgId ="+passenger.getPsgId();
            System.out.println(hql);
            Query query = session.createQuery(hql);
            query.setParameter("pass", passenger.getPassword());
            //query.setParameter("passenger_id", passenger.getPsgId());
            int result = query.executeUpdate();
            if(result==1){
                System.out.println("true");  
            }
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
    
    public boolean updatePassenger(Passenger passenger) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            String hql = "UPDATE Passenger set firstname = :fname, lastname = :lname, email = :mail, telNo = :tel "
                    + "WHERE psgId ="+passenger.getPsgId();
            System.out.println(hql);
            Query query = session.createQuery(hql);
            query.setParameter("fname", passenger.getFirstname());
            query.setParameter("lname", passenger.getLastname());
            query.setParameter("mail", passenger.getEmail());
            query.setParameter("tel", passenger.getTelNo());
            //query.setParameter("passenger_id", passenger.getPsgId());
            int result = query.executeUpdate();
            if(result==1){
                System.out.println("true");  
            }
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
    
    public List getPassengerByID(int id) {
        Session session = null;
        Transaction tx = null;
        List passenger = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Passenger where psgId ="+id);
            passenger = query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return passenger;
    }
    
    public int getAllPassenger() {
        Session session = null;
        Transaction tx = null;
        List passenger = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Passenger");
            passenger = query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return passenger.size();
    }

    public int getAllPayment() {
        Session session = null;
        Transaction tx = null;
        List payment = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Payment");
            payment = query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return payment.size();
    }

    public int getAllTicketinfo() {
        Session session = null;
        Transaction tx = null;
        List ticketinfo = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Ticketinfo");
            ticketinfo = query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return ticketinfo.size();
    }

    public List getAllTicketinfoByPassengerID(int id) {
        Session session = null;
        Transaction tx = null;
        List ticketinfo = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            String hql= "from Ticketinfo I, Train T where  T.trainTravelId = I.trainTravelId and I.psgId ="+id;
            Query query = session.createQuery(hql);
            ticketinfo = query.list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return ticketinfo;
    }
    
    public boolean insertPassenger(Passenger passenger) {
        boolean success = false;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
            session.save(passenger);
            tx.commit();
            success = true;
        } catch (Exception e) {
            success = false;
        } finally {
            session.close();
        }
        return success;
    }

    public boolean insertTicketInfo(Ticketinfo ticketinfo) {
        boolean success = false;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
            session.save(ticketinfo);
            tx.commit();
            success = true;
        } catch (Exception e) {
            success = false;
        } finally {
            session.close();
        }
        return success;
    }

    public boolean insertPaymentl(Payment payment) {
        boolean success = false;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.getTransaction();
            tx.begin();
            session.save(payment);
            tx.commit();
            success = true;
        } catch (Exception e) {
            success = false;
        } finally {
            session.close();
        }
        return success;
    }

    public List searchTrainTravel(String search_ticketfrom, String search_ticketto) {
        String message = null;
        Session session = null;
        Transaction tx = null;
        List searchtrainList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();
            //Query query = session.createQuery("from Train as train where  train.fromLocation = '" + search_ticketfrom + "' and train.toLocation = '" + search_ticketto + "'");

            // Query query2 = session.createQuery("from Train as train,TrainDetail as trainde where train.trainTravelId = trainde.trainTravelId"
            //       + " and train.fromLocation = '%" + search_ticketfrom + "%'and train.toLocation = '%" + search_ticketto + "%' ");
            //searchtrainList = (List<Train>) query.list();
            Query query2 = session.createQuery("from Train as train,TrainDetail as trainde where train.trainTravelId = trainde.trainTravelId"
                    + " and train.fromLocation = '" + search_ticketfrom + "'and train.toLocation = '" + search_ticketto + "'");
            searchtrainList = query2.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return searchtrainList;
    }

    public void TicketUpdate(int trainid, String status) {
        String message = null;
        Session session = null;
        Transaction tx = null;
        List ticketUpdate = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.getTransaction();
            tx.begin();

            Query query2 = session.createQuery("update  Ticketinfo set  status = :Status where TicketId = :ticketId");
            query2.setParameter("Status", status);
            query2.setParameter("ticketId", trainid);
            //earchtrainList = query2.list();
            int result = query2.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Service</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Service at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
