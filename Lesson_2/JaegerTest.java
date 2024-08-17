public class JaegerTest {
    public static void main(String[] args) {
        Jaeger striker = new Jaeger();
        striker.setModelName("Striker Eureka");
        striker.setMark("Mark-5");
        striker.setOrigin("Australia");
        striker.setHeight(250f);
        striker.setWeight(41792f);
        striker.setSpeed(10);
        striker.setStrength(10);
        striker.setArmor(9);

        Jaeger gipsy = new Jaeger("Gipsy Avenger", "Mark-6", "USA", 268f,
                    45270f, 12, 15, 20);

        System.out.println(striker.getModelName());
        System.out.println(striker.getOrigin());
        System.out.println(striker.getSpeed());
        System.out.println(striker.getArmor());

        System.out.println(gipsy.getModelName());
        System.out.println(gipsy.getMark());
        System.out.println(gipsy.getHeight());
        System.out.println(gipsy.getStrength());

        striker.run();
        striker.fly();
        gipsy.attack();
    }
}