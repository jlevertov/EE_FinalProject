package il.ac.hit.finalproject;

public interface IToDoListDAO {
	public boolean AddListItem(ToDoListItem Item)throws ToDoListPlatformException;
	public boolean RemoveListItem(int ItemId)throws ToDoListPlatformException;
	public ToDoListItem[] GetItems()throws ToDoListPlatformException;
	public void PrintItems()throws ToDoListPlatformException;
}
