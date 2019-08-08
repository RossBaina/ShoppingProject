package projectmarket.shipping;

public class ShippingType {
    private String shippingType = REGULAR;
    private Double cost = REGULAR_BIKE_COST;
    public static final String REGULAR = "regular";
    public static final Double REGULAR_BIKE_COST = 10.0;
    public static final Integer REGULAR_BIKE_MAX_WEIGHT_KG = 5;
    public static final Integer REGULAR_BIKE_MAX_SIZE_CM_WIDTH = 30;
    public static final Integer REGULAR_BIKE_MAX_SIZE_CM_HIGHT = 30;
    public static final String TAXI = "taxi";
    public static final Double TAXI_COST = 20.0;
    public static final Integer TAXI_BIKE_MAX_WEIGHT_KG = 5;
    public static final Integer TAXI_BIKE_MAX_SIZE_CM_WIDTH = 30;
    public static final Integer TAXI_BIKE_MAX_SIZE_CM_HIGHT = 30;
    public static final String WAGON = "wagon";
    public static final Double WAGON_COST = 30.0;
    public static final Integer WAGON_BIKE_MAX_WEIGHT_KG = 5;
    public static final Integer WAGON_BIKE_MAX_SIZE_CM_WIDTH = 30;
    public static final Integer WAGON_BIKE_MAX_SIZE_CM_HIGHT = 30;

    public ShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
