package il.ac.hit.finalproject;

import java.util.Date;
//import javassist.bytecode.Descriptor.Iterator;
public class Program {
	
	public static void main(String[] args) {
		ToDoListItem item1 = new ToDoListItem("Test", "What house?", new Date(), new Date());
		User item2 = new User(1, "Jalevertov", "BLAAAAAAAA", "jlevertov@walla.com", true);
		IDAO dao = new DAO();
		try {
			dao.AddListItem(item1);
			//dao.AddUser(item2);
		}
		catch (ToDoListPlatformException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
