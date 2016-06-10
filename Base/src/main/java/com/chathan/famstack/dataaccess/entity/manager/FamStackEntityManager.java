package com.chathan.famstack.dataaccess.entity.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class FamStackEntityManager<T> {
	@PersistenceContext
	private EntityManager manager;
	
	public List<T> getAllUsers(Class<T> entity) 
	{
		List<T> users = (List<T>) manager.createQuery("Select a From "+ entity.getSimpleName() +" a", entity).getResultList();
        return users;
	}
}
