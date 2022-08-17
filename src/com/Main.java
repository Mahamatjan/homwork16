package com;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();

        Animal[] animals = {animal, shark, turtle, eagle};
        for (Animal i : animals) {
            if (i instanceof Shark) {
                ((Shark) i).attack();
            }

            if (i instanceof Eagle) {
                ((Eagle) i).fly();
            }

            if (i instanceof Turtle) {
                ((Turtle) i).swim();
            }

        }
    }
}