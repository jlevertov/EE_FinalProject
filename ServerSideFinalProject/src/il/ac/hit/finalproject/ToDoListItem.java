package il.ac.hit.finalproject;

import java.util.Date;
import javax.persistence.*;


public class ToDoListItem {

	
	private int Id;
	
	
	private String Category;
	
	
	private String WhatToDo;
	
	
	private Date CreationDate;
	
	public ToDoListItem()
	{
		super();
	}
	
	

	public ToDoListItem(int id, String category, String whatToDo, Date creationDate) {
		super();
		Id = id;
		Category = category;
		WhatToDo = whatToDo;
		CreationDate = creationDate;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
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
		return "ToDoListItem [Id=" + Id + ", Category=" + Category + ", WhatToDo=" + WhatToDo + ", CreationDate="
				+ CreationDate + "]";
	}
}
