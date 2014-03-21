

import JavaBeans.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class GetProductCategoryServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String recievedCategoryName = request.getParameter("categoryName");
        HttpSession session = request.getSession(true);
        session.setAttribute("categoryName", recievedCategoryName);
        Product product1 = new Product("Hello Kitty",1,"Pillow Buddy",5,11.75,"hellokity.jpg");
        Product product2 = new Product("Zibbo",2,"Bright Starts Sensory Plush Pal Zebra",5,8.90,"ziboo.jpg");
        Product product3 = new Product("Playgro",3,"Playgro Playtime Gift Pack",5,39.99,"playgro.jpg");
        Product product4 = new Product("Infantino",4,"Infantino Pop & Play 3-Piece Plush Hanging Toy Set, Jungle",5,8.32,"infantino.jpg");
        ArrayList<Product> productList = new ArrayList<Product>(); 
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        request.setAttribute("productList",productList);
        RequestDispatcher rd = request.getRequestDispatcher("admin_products.jsp"); 
         //out.println("Welcome To The Header_Footer Servlet");	
         rd.include(request, response);
        
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
