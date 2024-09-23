package br.com.proway.cursojava.app.domain.vehicle;

import br.com.proway.cursojava.app.domain.BaseEntity;

public class Vehicle extends BaseEntity {

    private String plate;
    private String color;
    private String model;

    public Vehicle(){
        super();
    }


    public Vehicle(Integer id, String plate, String color, String model){
        this.setId(id);
        this.setPlate(plate);
        this.setColor(color);
        this.setModel(model);
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
