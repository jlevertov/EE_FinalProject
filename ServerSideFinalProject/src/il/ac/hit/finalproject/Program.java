package il.ac.hit.finalproject;

import java.util.Date;

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
