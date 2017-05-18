
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(Brand.BMW,"X5",2005, Color.BLACK,500000,"ПТН-ПНХ");
        Car car2 = new Car(Brand.BMW,"320d",2000, Color.WHITE,700000,"AA1010HH");
        Car car3 = new Car(Brand.VW,"Golf",1998, Color.RED,100000,"АА9339OP");
        Car car4 = new Car(Brand.MERCEDES,"SLK",2015, Color.WHITE,2000000,"АА0101IT");
        Car car5 = new Car(Brand.OPEL,"Vectra",2000, Color.GREEN,150000,"АА5555НН");
        Car car6 = new Car(Brand.MERCEDES,"SLK",2005, Color.RED,900000,"АА7777IT");
        Car car7 = new Car(Brand.BMW,"320d",2005, Color.BLUE,100000,"AA9999PH");

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6, car7);

        Query query = new Query();

        System.out.println("Выборка авто марки <BMW>:");
        List<Car> resultList1 = query.getCarsByBrand(cars, Brand.BMW);
        for (Car car : resultList1)
            System.out.println(car.toString());

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Выборка авто модели <320d> и сроком эксплуатации больше 12 лет:");
        List<Car> resultList2 = query.getCarsByModelAndTerm(cars, "320d", 2015, 12);
        for (Car car : resultList2)
            System.out.println(car.toString());


        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Выборка авто с годом выпуска <2005> и ценой больше 200000:");
        List<Car> resultList3 = query.getCarsByYearAndPrice(cars, 2005, 200000);
        for (Car car : resultList3)
            System.out.println(car.toString());

    }
}