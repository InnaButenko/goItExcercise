package methods;

class Rocket {
    {
    System.out.println("Init rocket in init block");
        }

        public Rocket() {
            System.out.println("Init rocket in constructor");
        }
    }

    class RocketLauncher {
        public static void main(String[] args) {
            new Rocket();
        }
    }

class SpaceLauncher {
    {
        System.out.println("Ready...");
    }

    {
        System.out.println("Set...");
    }

    {
        System.out.println("Fire!");
    }

    public static void main(String[] args) {
        new SpaceLauncher();
    }
}



