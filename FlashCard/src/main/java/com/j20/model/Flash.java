package com.j20.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
// @Table(name = "XYZ")
public class Flash {

	@Id
	private int no =1;
	private String title = "some";
	//@ManyToMany
	//private List<FlashList> list;
	
	
	
}
