package chapter3.variantb.circle.action;

import chapter3.variantb.circle.entity.Circle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sukhocheva Maryana
 */
public class InputData {
   // addes N random circles to list
    public static List<Circle> generationRandomNCircles(int n) {
        List<Circle> arrayOfCircles = new ArrayList<>();
        
        Random rand = new Random();
        int i = 0;
        while (i < n) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            double r = rand.nextDouble()+1;
            try {
                Circle tempCircle = new Circle(x, y, r);
                i++;
                arrayOfCircles.add(tempCircle);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return arrayOfCircles;
    }
    
    public static  List<Circle> generationCircles(){
        List<Circle> arrayOfCircles = new ArrayList<>();
        try {
            Circle circle1 = new Circle(5, 5, 22.3);
            Circle circle2 =new Circle(3, 0, 5);
            Circle circle3 =new Circle(10, 0, 7.54);
            Circle circle4 =new Circle(5, 4, 3);
            Circle circle5 =new Circle(5, 10, 44);

            arrayOfCircles.add(circle1);
            arrayOfCircles.add(circle2);
            arrayOfCircles.add(circle3);
            arrayOfCircles.add(circle4);
            arrayOfCircles.add(circle5);
       } catch (Exception ex) {
            System.err.println("Error when creating circles");
        }
        System.out.println("Создан массив окружностей");
        return arrayOfCircles;
               
    }
    
  
}
