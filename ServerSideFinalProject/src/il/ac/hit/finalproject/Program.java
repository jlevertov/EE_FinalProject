package il.ac.hit.finalproject;

import java.util.Date;
//import javassist.bytecode.Descriptor.Iterator;
public class Program {
	
	public static void main(String[] args) {
		ToDoListItem item1 = new ToDoListItem(1, "Regular", "What house?", new Date());
		//ToDoListItem[] l = null;
		IToDoListDAO dao = new ToDoListDAO();
		try {
			dao.AddListItem(item1);
			dao.PrintItems();
		} catch (ToDoListPlatformException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}