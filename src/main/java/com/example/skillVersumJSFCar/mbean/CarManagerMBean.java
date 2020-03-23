
package com.example.skillVersumJSFCar.mbean;

import com.example.skillVersumJSFCar.data.Car;
import com.example.skillVersumJSFCar.repository.CarRepository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;







@Transactional
@Named
@ViewScoped
public class CarManagerMBean {
    
    
    
    
    private List<Car> carList;
    
    @Autowired
    private CarRepository repository;
    
     private Car selectedCar;



@PostConstruct
private void init() {
     loadAll();
        selectedCar = new Car();
}
        public void save() {
        if (selectedCar.getId() == null) {
            repository.save(selectedCar);
        } else {
            repository.update(selectedCar);
        }
        loadAll();
        selectedCar = new Car();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sikeres adatmentés!", null));
    }
        
        
        public void delete(Long id) {
        repository.delete(id);
        loadAll();

    }
        
        public void selectOne(Car weapon) {
        selectedCar = weapon;

    }


    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
        
         private void loadAll() {
        carList = repository.findAll();
    }
    
       
        
        
        
       
        
        
       
    }




