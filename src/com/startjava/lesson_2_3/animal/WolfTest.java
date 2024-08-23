package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("wolf");
        wolf.setSex('M');
        wolf.setWeight(10);
        wolf.setAge(5);
        wolf.setColor("Black");
        System.out.println(wolf.getName());
        System.out.println(wolf.getSex());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}