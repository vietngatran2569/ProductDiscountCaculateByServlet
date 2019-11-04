import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "DiscountProductServlet",urlPatterns = "/caculate")
public class DiscountProductServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      String productDes=request.getParameter("productDescription");
      float listPrice=Float.parseFloat(request.getParameter("listPrice"));
      float discountPercent=Float.parseFloat(request.getParameter("discountPercent"));

      float caculateDiscount=listPrice*discountPercent*1/10;

        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("Product description: "+productDes);
        writer.println("Caculate discount is: ");
        writer.println(caculateDiscount);
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
