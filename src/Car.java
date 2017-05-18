import java.awt.*;
import java.util.Date;

/**
 * Created by Andrew on 09.07.2015.
 */
public class Car {
    private static int newId=1;
    private Brand brand;
    private String model;
    private int yearOfOrigin;
    private Color color;
    private int price;
    private String regMark;

    private final int id = newId++;

    public Car(Brand brand,String model, int yearOfOrigin, Color color, int price, String regMark){
        this.brand = brand;
        this.model = model;
        this.yearOfOrigin = yearOfOrigin;
        this.color = color;
        this.price = price;
        this.regMark = regMark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("id='").append(id).append('\'');
        sb.append(", марка=").append(brand);
        sb.append(", модель=").append(model);
        sb.append(", год выпуска:=").append(yearOfOrigin);
        sb.append(", гос.номер=").append(regMark);
        sb.append(", цена=").append(price);
        sb.append('}');
        return sb.toString();
    }
    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public Brand getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {return model;}

    public void setYearOfOrigin(int yearOfOrigin){
        this.yearOfOrigin = yearOfOrigin;
    }

    public int getYearOfOrigin(){
        return yearOfOrigin;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;}

    public void  setPrice(int price){
        this.price = price;
    }

    public long getPrice(){
        return price;
    }

    public void setRegMark(String regMark){
        this.regMark  = regMark;
    }

    public String getRegMark(){
        return regMark;
    }



}