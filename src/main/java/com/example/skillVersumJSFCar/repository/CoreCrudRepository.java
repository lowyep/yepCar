
package com.example.skillVersumJSFCar.repository;

import com.example.skillVersumJSFCar.data.AbstractEntity;
import java.util.List;


public interface CoreCrudRepository<T extends AbstractEntity>  {
    
    
    List<T> findAll();

    T findById(Long id);

    void save(T entity);

    void delete(Long id);

    void update(T entity);
}
