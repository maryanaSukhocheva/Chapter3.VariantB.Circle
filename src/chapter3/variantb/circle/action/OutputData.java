package chapter3.variantb.circle.action;

import chapter3.variantb.circle.entity.Circle;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {
    //вывод площади и периметра треугольников
    public static void outputAreaPerimetr(List<Circle> circles) {
        if (circles!=null){
        for (Circle circle : circles) {
            System.out.println(circle);

            System.out.print("Площадь = ");
            System.out.println(circle.findS());

            System.out.print("Периметр = ");
            System.out.println(circle.findP());

            System.out.println();
        }
    } else {
         System.err.print("Массив окружностей не создан");   
        }
    }
    
    public static void outputArrayOfCicles(List<Circle> circles) {
        if (circles!=null){
        for (Circle circle : circles) {
            System.out.println(circle);
            System.out.println();
        }
        } else {
         System.err.print("Массив окружностей не создан");      
        }
    }
    
   }
