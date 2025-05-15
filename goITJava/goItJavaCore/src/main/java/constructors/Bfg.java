package constructors;
class Bfg {
    private int amount;
    private int damage;
    private String name;

    public Bfg(int amount, int damage, String name) {
        this.name = name;
        this.amount = amount;
        this.damage = damage;
    }
    public Bfg( int amount, int damage){
        this(amount, damage, "Bfg");
    }
    public Bfg( int amount){
        this(amount, 50,"Bfg");
    }

    public Bfg(){
        this(1000, 50, "Bfg");
    }
    public String toString(){
        return name + " , amount: " + amount + " , damage: " + damage;

    }
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300

        System.out.println(new Bfg(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new Bfg(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new Bfg(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new Bfg());

    }
}
