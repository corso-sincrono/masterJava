package com.dvdStore.model;

import java.util.ArrayList;

public interface ActorUtility {
	
	
	public Actor findById(int id);
	public ArrayList<Actor> getAll();
	public ArrayList<Actor> findByName(String n);

}
