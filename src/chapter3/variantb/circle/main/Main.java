package chapter3.variantb.circle.main;

import chapter3.variantb.circle.action.Action;
import chapter3.variantb.circle.action.InputData;
import chapter3.variantb.circle.action.OutputData;
import chapter3.variantb.circle.entity.Circle;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<Circle> circles = InputData.generationCircles() ;
      
        System.out.println("Площадь и периметр окружностей:");
        OutputData.outputAreaPerimetr(circles);
        System.out.print("Наибольший по площади объект ");
        System.out.println(Action.getMaxAreaCircle(circles));

        System.out.print("Наименьший по площади объект ");
        System.out.println(Action.getMinAreaCircle(circles));
        
        List<Circle> circlesCenteredOnX = Action.circlesPassingThroughOneLineX(circles);
        if (circlesCenteredOnX.size()!=0) {
            System.out.print("Группа окружностей, центры которых лежат на одной прямой, с X = ");
            System.out.print(circlesCenteredOnX.get(0).getX());
            System.out.println();
            OutputData.outputArrayOfCicles(circlesCenteredOnX);
            
        }
        System.out.println();
        List<Circle> circlesCenteredOnY = Action.circlesPassingThroughOneLineY(circles);
        if (circlesCenteredOnY.size()!=0) {
            System.out.print("Группа окружностей, центры которых лежат на одной прямой, с Y = ");
            System.out.print(circlesCenteredOnY.get(0).getY());
            System.out.println();
            OutputData.outputArrayOfCicles(circlesCenteredOnY);
        }
    }
    
}
