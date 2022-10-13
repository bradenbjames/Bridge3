public abstract class Shape {
    protected int area;
    protected String shapeType;

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void computeArea();

    public void printShape() {
        System.out.println("Painting " + this.shapeType + " with " + color.fillColor() + ". Area = " + this.area);
    }
}
