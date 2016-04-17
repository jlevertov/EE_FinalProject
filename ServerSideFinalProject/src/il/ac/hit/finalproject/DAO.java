package il.ac.hit.finalproject;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class DAO implements IDAO {
	private SessionFactory factory;
	Session session = null;
	
	public DAO() {
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
		try{
		session.save(Item);
		session.getTransaction().commit();
		} catch(HibernateException e){
			System.out.println(e.getMessage());
			throw new ToDoListPlatformException();
		}
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
		String hql = "FROM notes";
		Query query = session.createQuery(hql);
		List ListItems = query.list();
		Iterator i = ListItems.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}
	}
	public ToDoListItem[] GetItems()throws ToDoListPlatformException
	{
		return null;
	}

	@Override
	public boolean AddUser(User user) throws ToDoListPlatformException {
		session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean RemoveUser(int userId) throws ToDoListPlatformException {
		session = factory.openSession();
		session.beginTransaction();
		User entity = new User();
		entity.setId(userId);
		session.delete(entity);
		return true;
	}

	@Override
	public User[] GetUsers() throws ToDoListPlatformException {
		return null;
	}

	@Override
	public void PrintUsers() throws ToDoListPlatformException {
		session = factory.openSession();
		session.beginTransaction();
		List ListItems = session.createQuery("from notes").list();
		Iterator i = ListItems.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
