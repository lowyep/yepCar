
package com.example.skillVersumJSFCar.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "car")
public class Car extends AbstractEntity {
    
   
    @NotEmpty(message = "{type.not.null}")
    @Column(name = "type")
    private  String type;
    
    @NotEmpty(message= "Adj meg egy gyártót")
    @Column(name = "manufacturer")
    private String manufacturer;
    
   
    //@Range(min = 1)
    @NotNull(message= "Add meg az ajtók számát")
    @Column(name = "doorNumbers", nullable = false )
    private Integer  doorNumbers;
    
    @NotNull(message= "Adj meg gyártási évet")
    //@Range(min = 1821, message= "az értéknek 1821 és a mai dátum közé kell esnie")
    @Column(name = "manufacturingDate" ,nullable = false)
    private Integer  manufacturingDate;

    public Car() {
    }
    
    
    public Car(Long id, String type, String manufacturer, Integer doorNumbers, Integer manufacturingDate) {
        super(id);
        this.type = type;
        this.manufacturer = manufacturer;
        this.doorNumbers = doorNumbers;
        this.manufacturingDate = manufacturingDate;
    }
    
    
    
    
    

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getDoorNumbers() {
        return doorNumbers;
    }

    public void setDoorNumbers(Integer doorNumbers) {
        this.doorNumbers = doorNumbers;
    }

    public Integer getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Integer manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    

    
    
    
    
}
