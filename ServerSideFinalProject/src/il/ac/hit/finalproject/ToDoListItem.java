package il.ac.hit.finalproject;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Notes")
public class ToDoListItem {

	@Id
	@Column(name = "ID")
	private int Id;
	@Column(name = "CATEGORY")
	private String Category;
	@Column(name = "TEXT")
	private String WhatToDo;
	@Column(name = "CREATION_TIME")
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
	
}
