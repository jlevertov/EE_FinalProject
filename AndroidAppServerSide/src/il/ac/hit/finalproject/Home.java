package il.ac.hit.finalproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Login")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDAO dao = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	//dao = DAO.GetInstance();
    	ToDoListItem item = new ToDoListItem("TEST222222", "Testit", new Date(), new Date());
    	PrintWriter out = response.getWriter();
    	out.println(item);
    	/*List<ToDoListItem> items = item.GetAllItems();
    	PrintWriter out = response.getWriter();
    	for(ToDoListItem itemss : items)
    	{
    		out.println(itemss);
    	}*/
    	//getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//dao = DAO.GetInstance();
		doGet(request, response);
	}

}
