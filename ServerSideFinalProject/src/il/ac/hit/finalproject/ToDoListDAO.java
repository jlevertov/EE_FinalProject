package il.ac.hit.finalproject;

import java.util.List;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class ToDoListDAO implements IToDoListDAO {
	private SessionFactory factory;
	Session session = null;
	
	public ToDoListDAO() {
		try{
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Throwable ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Override
	public boolean AddListItem(ToDoListItem Item) throws ToDoListPlatformException {
		session = factory.openSession();
		session.beginTransaction();
		session.save(Item);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean RemoveListItem(int ItemId) throws ToDoListPlatformException {
		session = factory.openSession();
		session.beginTransaction();
		ToDoListItem entity = new ToDoListItem();
		entity.setId(ItemId);
		session.delete(entity);
		return true;
	}

	@Override
	public void PrintItems() throws ToDoListPlatformException {
		session = factory.openSession();
		session.beginTransaction();
		List ListItems = session.createQuery("from notes").list();
		Iterator i = ListItems.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public ToDoListItem[] GetItems()throws ToDoListPlatformException
	{
		return null;
	}

}