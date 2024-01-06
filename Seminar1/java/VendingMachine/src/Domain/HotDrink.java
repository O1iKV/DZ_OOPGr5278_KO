package Domain;

public class HotDrink extends Product {

    private float waterTemperature;

    public HotDrink(int price, int place, String name, long id, float waterTemperature) {
        super(price, place, name, id);
        this.waterTemperature = waterTemperature;
    }

    public float getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(float waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
    
    @Override 
    public String toString()
    {
        return super.toString() + "temperature="+waterTemperature+"\n";
    }
    
}