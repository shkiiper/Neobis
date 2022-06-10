public class Car {
    private long carId;
    private String carName;
    private String carModel;
    private String color;
    private double engineSize;

    public Car() {
    }

    public Car(long carId, String carName, String carModel, String color, double engineSize) {
        this.carId = carId;
        this.carName = carName;
        this.carModel = carModel;
        this.color = color;
        this.engineSize = engineSize;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getcarModel() {
        return carModel;
    }

    public void setcarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getengineSize() {
        return engineSize;
    }

    public void setengineSize(double engineSize) {
        this.engineSize = engineSize;
    }

}