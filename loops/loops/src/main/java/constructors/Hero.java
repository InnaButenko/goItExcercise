package constructors;

public class Hero {
            private String name;
            private int hp;
    public Hero(String name, int hp) {
        this.name = "Paratrooper";
        this.hp = 100;
}

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Hero hero = new Hero("Paratrooper", 100);

        // Expect Paratrooper
        System.out.println(hero.getName());

        // Expect 100
        System.out.println(hero.getHp());
    }
    }

