package solid;

import solid.srp.Point;
import solid.srp.Square;
import src.solid.srp.CalcSquare;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        CalcSquare calc = new CalcSquare(square.getSide());
        System.out.printf("Площадь фигуры: %d \n", calc.getArea());
        square.drawFigure(2.0);


    }
}
