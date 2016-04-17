package il.ac.hit.finalproject;

public interface IDAO{
	
	//ITEMS
	public boolean AddListItem(ToDoListItem Item)throws ToDoListPlatformException;
	public boolean RemoveListItem(int ItemId)throws ToDoListPlatformException;
	public ToDoListItem[] GetItems()throws ToDoListPlatformException;
	public void PrintItems()throws ToDoListPlatformException;
	
	//USERS
	public boolean AddUser(User user) throws ToDoListPlatformException;
	public boolean RemoveUser(int userId) throws ToDoListPlatformException;
	public User[] GetUsers() throws ToDoListPlatformException;
	public void PrintUsers() throws ToDoListPlatformException;
}
