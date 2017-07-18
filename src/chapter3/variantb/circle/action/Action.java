package chapter3.variantb.circle.action;
import chapter3.variantb.circle.entity.Circle;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    
    public Action() {
    }

  
    // Наибольший по площади объект
    public static Circle getMaxAreaCircle(List<Circle> circles) {
        checkNull(circles);

        Circle[] circlesArray = new Circle[circles.size()];
        circlesArray = circles.toArray(circlesArray);

        return getMaxAreaCircle(circlesArray);
    }

    public static Circle getMaxAreaCircle(Circle... circles) {
        checkNull(circles);

        Circle maxAreaCircle = circles[0];

        for (int i = 1, size = circles.length; i < size; i++) {
            if (circles[i].findS() > maxAreaCircle.findS()) {
                maxAreaCircle = circles[i];
            }
        }

        return maxAreaCircle;
    }
//Наименьший по площади объект
    public static Circle getMinAreaCircle(List<Circle> circles) {
        checkNull(circles);

        Circle[] circlesArray = new Circle[circles.size()];
        circlesArray = circles.toArray(circlesArray);

        return getMinAreaCircle(circlesArray);
    }

    public static Circle getMinAreaCircle(Circle... circles) {
        checkNull(circles);

        Circle minAreaCircle = circles[0];

        for (int i = 1, size = circles.length; i < size; i++) {
            if (circles[i].findS() < minAreaCircle.findS()) {
                minAreaCircle = circles[i];
            }
        }

        return minAreaCircle;
    }

    private static void checkNull(Object object){
        if (object == null){
            throw new IllegalArgumentException();
        }
    }
  
    public static List<Circle> circlesPassingThroughOneLineX(List<Circle> circles) {
        double x = 0;
        boolean result_x=false;
        List<Circle> tempCirclesX = new ArrayList<>();
       
        if (circles!=null && circles.size()>1) {
            
            for (int i = 0; i < circles.size() ; i++) {
                x = circles.get(i).getX();
                for (int j = 0; j < circles.size(); j++) {
                if (i!=j) {
                    if (x==circles.get(j).getX()) {
                        result_x=true;
                        tempCirclesX.add(circles.get(j));
                    }
                   
                }
                }
                if (result_x) {
                      tempCirclesX.add(circles.get(i)); 
                      break;
                    } 
            }
                     
               
        } else {
            System.out.print("Массив окружностей состоит из одного объекта либо он не создан");
        }
        return tempCirclesX;
    }
    
    public static List<Circle> circlesPassingThroughOneLineY(List<Circle> circles) {
        double y = 0;
        boolean result_y=false;
        List<Circle> tempCirclesY = new ArrayList<>();
        if (circles!=null && circles.size()>1) {
            for (int i = 0; i < circles.size() ; i++) {
                y = circles.get(i).getY();
                for (int j = 0; j < circles.size(); j++) {
                if (i!=j) {
                    if (y==circles.get(j).getY()) {
                        result_y=true;
                        tempCirclesY.add(circles.get(j));
                    }
                   
                }
                }
                if (result_y) {
                      tempCirclesY.add(circles.get(i)); 
                      break;
                    } 
            }
            
                
               
        } else {
            System.out.print("Массив окружностей состоит из одного объекта либо он не создан");
        }
        return tempCirclesY;
    }
}
