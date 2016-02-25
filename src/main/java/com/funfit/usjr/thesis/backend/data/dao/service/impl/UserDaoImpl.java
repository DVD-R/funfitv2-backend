package com.funfit.usjr.thesis.backend.data.dao.service.impl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.funfit.usjr.thesis.backend.data.dao.service.UserDao;
import com.funfit.usjr.thesis.backend.models.Users;

/**
 * 
 * @author victor
 *
 */
@Transactional
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<Users> implements UserDao{

	public UserDaoImpl() {
		super(Users.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
	      Query query = entityManager.createQuery( "Select u " + "from Users u " + "where u.email=:email");
	      query.setParameter("email",email);
	      List<Users> list=(List<Users>)query.getResultList( );
		if(list != null){
			return true;	
		}else{
			return false;
		}
	}

	@Override
	public List<Users> index() {
		// TODO Auto-generated method stub
		TypedQuery<Users> query = entityManager.createQuery("Select u from Users u", Users.class);
		
		return query.getResultList();
	}
}