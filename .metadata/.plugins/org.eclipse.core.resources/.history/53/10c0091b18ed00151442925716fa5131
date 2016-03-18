package il.ac.hit.jacob;

import java.util.List;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Program {
	
	public static void main(String[] args) {
		ToDoListItem item1 = new ToDoListItem(2, "Regular", "What house?", new Date());
		IToDoListDAO dao = new ToDoListDAO();
		try {
			dao.AddListItem(item1);
		} catch (ToDoListPlatformException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
