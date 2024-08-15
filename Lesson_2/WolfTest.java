public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "wolf";
        wolf.sex = 'M';
        wolf.weight = 10;
        wolf.age = 7;
        wolf.color = "Black";
        System.out.println(wolf.name);
        System.out.println(wolf.sex);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howls();
        wolf.hunts();
    }
}