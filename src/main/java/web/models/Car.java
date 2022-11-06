package web.models;

public class Car {
    private String model;
    private String subModel;
    private int series;

    public Car(){}

    public Car(String model, String subModel, int series) {
        this.model = model;
        this.subModel = subModel;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getSubModel() {
        return subModel;
    }

    public void setSubModel(String subModel) {
        this.subModel = subModel;
    }

}
