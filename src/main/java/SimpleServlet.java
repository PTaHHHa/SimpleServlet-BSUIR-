import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String color = request.getParameter("operator");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Task</title>");
            out.println("</head>");
            out.println("<style>");
            out.println("body{ background-color:"+color+";}");

            /*THE PART OF OUTPUT TO THE CLIENT*/
            //out.println("<span style=\"background-color: "+color+"\"></span>");
            out.println("</style>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}

