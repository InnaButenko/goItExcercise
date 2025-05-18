package interfaces;

abstract class Shape {
    private String name;


    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getName());
        Square square = new Square();
        System.out.println(square.getName());
        Triangle triangle = new Triangle();
        System.out.println(triangle.getName());
        Quad quad = new Quad();
        System.out.println(quad.getName());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getName());


    }
}
