package com.chathan.famstack.dataaccess.entity.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chathan.famstack.dataaccess.entity.UserEntity;

@Repository
@Transactional
public class FamStackEntityManager {
	@PersistenceContext
	private EntityManager manager;
	
	public List<UserEntity> getAllUsers() 
	{
		List<UserEntity> users = manager.createQuery("Select a From UserEntity a", UserEntity.class).getResultList();
        return users;
	}
}
