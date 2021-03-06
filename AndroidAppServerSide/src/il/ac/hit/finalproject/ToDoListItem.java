package il.ac.hit.finalproject;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


public class ToDoListItem {

	
	private int Id;
	
	private String Title;
	
	private String WhatToDo;
	
	private Date CreationDate;
	
	private Date DeadLine;
	
	//public IDAO dao;
	
	public ToDoListItem()
	{
		super();
		//dao = DAO.GetInstance();
	}
	
	

	public ToDoListItem(String title, String whatToDo, Date creationDate, Date deadLine) {
		super();
		Title = title;
		WhatToDo = whatToDo;
		CreationDate = creationDate;
		DeadLine = deadLine;
		//dao = DAO.GetInstance();
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String category) {
		Title = category;
	}

	public String getWhatToDo() {
		return WhatToDo;
	}

	public void setWhatToDo(String whatToDo) {
		WhatToDo = whatToDo;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	@Override
	public String toString() {
		return "ToDoListItem [Id=" + Id + ", Category=" + Title + ", WhatToDo=" + WhatToDo + ", CreationDate="
				+ CreationDate + "]";
	}



	public Date getDeadLine() {
		return DeadLine;
	}



	public void setDeadLine(Date deadLine) {
		DeadLine = deadLine;
	}
	
	/*public List<ToDoListItem> GetAllItems()
	{
		List<ToDoListItem> toReturn = null;
		try {
			toReturn =  dao.GetItems();
		} catch (ToDoListPlatformException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return toReturn;
	}*/
	
}
