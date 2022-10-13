public class Client {
    public static void main(String[] args) throws Exception {
        RedColor redColor = new RedColor();
        GreenColor greenColor = new GreenColor();

        // instantiate a square, computeArea
        Shape square = new Square(4, redColor);
        square.computeArea();
        square.printShape();
        // changing the color of the square from red to green at runtime
        // computeArea, print
        square.setColor(greenColor);
        square.computeArea();
        square.printShape();

        // instantiate a rectangle, computeArea, print
        Shape rectangle = new Rectangle(6, 4, greenColor);
        rectangle.computeArea();
        rectangle.printShape();
        // changing the color of the square from green to red at runtime
        // computeArea, print
        rectangle.setColor(redColor);
        rectangle.computeArea();
        rectangle.printShape();

        // client is able to change the color of the shape at runtime
    }
}
