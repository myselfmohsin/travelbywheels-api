package org.travelbywheels.rest.common.repositories.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.travelbywheels.rest.common.entities.Person;
import org.travelbywheels.rest.common.entities.User;
import org.travelbywheels.rest.common.repositories.UserRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mohsin
 * Date: 25/11/2015
 * Time: 15:38
 * Copyright TravelByWheels.
 */

@Repository
public class UserRepoImpl implements UserRepo {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(UserRepoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUser(String userEmail) {

        Query query = entityManager.createQuery("SELECT user FROM User user WHERE user.userEmail = :userEmail");
        query.setParameter("userEmail",userEmail);
        List<User> users = query.getResultList();
        if(users.size() == 0){
            return null;
        } else {
            return users.get(0);
        }
    }

    @Override
    public int getEmailCount(String userEmail) {

        Query query = entityManager.createQuery("SELECT count(*) FROM User user WHERE user.userEmail = :userEmail");
        query.setParameter("userEmail",userEmail);
        List<Long> resultList = query.getResultList();
        return resultList.get(0).intValue();
    }

    @Transactional
    @Override
    public User registerUser(User user) {
        LOG.info("Registering User");
        Person person = new Person();
        person.setCreateDate(new Timestamp(Calendar.getInstance().getTime().getTime()));
        person.setCreatedBy(0L);
        person.setJpaVersionNumber(1L);
        LOG.info("Persisting Person");
        entityManager.persist(person);
        LOG.info("Person is Persisted");
        person.setCreatedBy(person.getPersonId());
        user.setUserId(person.getPersonId());
        user.setPersonByUserId(person);
        user.setIsActiveFlag("N");
        user.setCreateDate(new Timestamp(Calendar.getInstance().getTime().getTime()));
        user.setCreatedBy(user.getUserId());
        user.setJpaVersionNumber(1L);

        entityManager.persist(user);
        return user;
    }
}
