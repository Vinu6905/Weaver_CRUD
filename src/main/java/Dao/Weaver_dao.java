package Dao;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Dto.Weaver;
import Dto.Weaver;

@Component
public class Weaver_dao {

	@Autowired
	EntityManager manager;
	
	public void save( Weaver weaver){
		manager.getTransaction().begin();
		manager.persist(weaver);
		manager.getTransaction().commit();
	}
	
	public List<Weaver> fetch(){
		return manager.createQuery("select x from Weaver x").getResultList();
	}
	
	public void delete(int id){
		manager.getTransaction().begin();
		manager.remove(manager.find(Weaver.class, id));
		manager.getTransaction().commit();
	}
	
	public Weaver find(int id){
		return manager.find(Weaver.class, id);
	}
	
	public void update(Weaver weaver){
		manager.getTransaction().begin();
		manager.merge(weaver);
		manager.getTransaction().commit();
	}
}
