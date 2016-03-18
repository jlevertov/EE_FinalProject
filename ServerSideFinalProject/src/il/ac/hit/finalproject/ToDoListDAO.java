package il.ac.hit.finalproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ToDoListDAO implements IToDoListDAO {
	private SessionFactory factory;
	Session session;
	public ToDoListDAO() {
		try{
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Throwable ex)
		{
			throw new ExceptionInInitializerError();
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ToDoListItem[] GetItems() throws ToDoListPlatformException {
		// TODO Auto-generated method stub
		return null;
	}

}
