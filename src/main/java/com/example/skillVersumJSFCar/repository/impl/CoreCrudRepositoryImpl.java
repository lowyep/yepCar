
package com.example.skillVersumJSFCar.repository.impl;

import com.example.skillVersumJSFCar.data.AbstractEntity;
import com.example.skillVersumJSFCar.repository.CoreCrudRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



public  abstract class CoreCrudRepositoryImpl <T extends AbstractEntity> implements CoreCrudRepository<T>{
    
     public abstract Class getManagedClass();
     
     @PersistenceContext
    protected EntityManager em;

    @Override
    public List<T> findAll() {
       return em.createQuery("select n from " + getManagedClass().getSimpleName() + " n").getResultList();
    }

   @Override
    public T findById(Long id) {
        return (T) em.find(getManagedClass(), id);
    }

    @Override
    public void save(T entity) {
       
        em.persist(entity);
    }

    @Override
    public void delete(Long id) {
        em.remove(findById(id));
    }

    @Override
    public void update(T entity) {
        
        em.merge(entity);
    }
    
}
