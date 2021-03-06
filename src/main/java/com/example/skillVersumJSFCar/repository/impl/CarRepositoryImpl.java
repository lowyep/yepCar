

package com.example.skillVersumJSFCar.repository.impl;

import com.example.skillVersumJSFCar.data.Car;
import com.example.skillVersumJSFCar.repository.CarRepository;
import org.springframework.stereotype.Repository;

@Repository
public  class CarRepositoryImpl extends CoreCrudRepositoryImpl<Car> implements CarRepository{

    @Override
    public Class getManagedClass() {
       return Car.class;
    }
    
}
