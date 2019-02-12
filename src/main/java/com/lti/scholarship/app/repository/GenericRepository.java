package com.lti.scholarship.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.entity.StudentLogin;

@Component
public class GenericRepository<E> {

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	public void store(Object obj) {
		entityManager.merge(obj);
	}

	@Transactional
	public <E> E fetchById(Class<E> classname, Object pk) {
		E e = entityManager.find(classname, pk);
		return e;
	}

	@Transactional
	public <E> List<E> fetchAll(Class<E> clazz) {
		Query q = entityManager.createQuery("select obj  from " + clazz.getName() + " as obj");// JPQL
		return q.getResultList();
	}

	@Transactional
	public boolean verify(String userid, String password) {
		List<Student> students = fetchAll(Student.class);
		boolean flag = false;
		int count=0;
		for (Object student : students) {
			
			if (userid.equals(      ((Student) student).getName())  && 
	      password.equals(       ((Student) student).getPassword())      ) {	
				System.out.println("original=>"+ ((Student) student).getName()+"           "+"expected=>  " +userid );
				System.out.println("original=>"+ ((Student) student).getPassword() +"           "+"expected=> "+password);
				
				System.out.println("LoginSuccessFull...!");
				flag = true;
			} else
				if(flag=!true) {
					System.out.println("Sorry ..User Name or Password in correct");}
		}
		
		//System.out.println("original=>"+ ((Student) student).getName()+"           "+"expected=>  " +userid );
		//System.out.println("original=>"+ ((Student) student).getPassword() +"           "+"expected=> "+password);
		
		return flag;
	}
}
