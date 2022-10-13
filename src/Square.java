public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength, Color colorType) {
        super(colorType);
        this.sideLength = sideLength;
        this.shapeType = "square";
    }

    @Override
    public void computeArea() {
        // TODO Auto-generated method stub
        this.area = sideLength * sideLength;
    }

}