package il.ac.hit.finalproject;

import java.util.Date;
import java.util.List;
//import javassist.bytecode.Descriptor.Iterator;
public class Program {
	
	public static void main(String[] args) {
		ToDoListItem item1 = new ToDoListItem("Test", "What house?", new Date(), new Date());
		List<ToDoListItem> arr = null;
		//User item2 = new User(1, "Jalevertov", "BLAAAAAAAA", "jlevertov@walla.com", true);
		IDAO dao = DAO.GetInstance();
		try {
			//dao.AddListItem(item1);
			//dao.AddUser(item2);
			dao.PrintItems();
			dao.PrintUsers();
			//arr = item1.GetAllItems();
			for(ToDoListItem it : arr)
			{
				System.out.println("-----\n" + it + "\n-------");
			}
		}
		catch (ToDoListPlatformException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
