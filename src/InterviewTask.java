/**
 * 3. Написать пример кода, который реализует принцип полиморфизма,
 * на примере фигур — круг, квадрат, треугольник.
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class InterviewTask {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle());
        figures.add(new Triangle());
        figures.add(new Square());

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
