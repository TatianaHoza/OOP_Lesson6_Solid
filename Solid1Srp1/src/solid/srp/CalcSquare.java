package src.solid.srp;

public class CalcSquare implements Shape{

    public CalcSquare(int side){
        this.side = side;
    }
    private int side;

    @Override
    public int getArea() {
        return side*side;
    }
}
