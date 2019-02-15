package com.dvdStore.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dvdStore.dao.Dao;

public class ActorImpl implements ActorUtility {

	@Override
	public Actor findById(int id) {
		
		Actor ac=null;
		
		String query="select * from actor where id_actor ="+id;
		Connection c=Dao.getConnection();
		try {
				Statement s=c.createStatement();
				ResultSet rst=s.executeQuery(query);
				
				if(rst.first()) {
					
					ac=new Actor();
					ac.setNome(rst.getString("first_name"));
					ac.setCognome(rst.getString("last_name"));
				}
				
				
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Dao.closeConnection();
	}
		return ac;
	}

	@Override
	public ArrayList<Actor> getAll() {

		ArrayList<Actor> list=new ArrayList<Actor>();
		Actor ac=null;
		
		String query="select * from actor";
		Connection c=Dao.getConnection();
		try {
			
			Statement st=c.createStatement();
			ResultSet rst=st.executeQuery(query);
			
			while(rst.next()) {
				
				ac=new Actor();
				ac.setCognome(rst.getString("last_name"));
				ac.setNome(rst.getString("first_name"));
				list.add(ac);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Dao.closeConnection();
	}
		
		return list;
	}

	@Override
	public ArrayList<Actor> findByName(String n) {
		ArrayList<Actor> list=new ArrayList<Actor>();
		Actor ac=null;
		
		String query="select * from actor where first_name ='"+n+"'";
		Connection c=Dao.getConnection();
		try {
				Statement s=c.createStatement();
				ResultSet rst=s.executeQuery(query);
				
				while(rst.next()) {
					
					ac=new Actor();
					ac.setNome(rst.getString("first_name"));
					ac.setCognome(rst.getString("last_name"));
					list.add(ac);
				}
				
				
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
				Dao.closeConnection();
		}
		return list;
	}

}
