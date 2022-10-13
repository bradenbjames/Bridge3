public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width, Color colorType) {
        super(colorType);
        this.length = length;
        this.width = width;
        this.shapeType = "rectangle";
    }

    @Override
    public void computeArea() {
        // TODO Auto-generated method stub
        this.area = length * width;
    }
}
