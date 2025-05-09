package constructors;

class Shape {
        private String name;

        public Shape(String name) {
            this.name = name;
            System.out.println("Call in Shape");
        }
    }

    class Circle extends Shape {
        private float radius;

        public Circle(float radius) {
            super("Circle"); //Найперша інструкція
            this.radius = radius;

            System.out.println("Call in Circle");
        }
    }



    //Цей клас, Quad, не скомпілюється - немає виклику батьківського конструктора
//    class Quad extends Shape {
//        public Quad() {
//
//        }
//    }
    class SpaceObject {
        public SpaceObject() {
            System.out.println("Space Object Constructor");
        }
    }

class Star extends SpaceObject {
    public Star() {
        System.out.println("Star Constructor");
    }
}

class Launcher {
    public static void main(String[] args) {
        new Circle(4.0f);
        new Star();

    }
}



