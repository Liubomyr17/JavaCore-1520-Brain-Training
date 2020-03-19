package com.company;

/*

1520. Level 15 Lection 20. Brain Training
Finding a logical mistake: Duck must correctly implement the Movable interface.
Correct the mistake.
The output to the console should be:
flying
moving

Requirements:
1. The result of the output to the screen must meet the condition.
2. The doAnotherAction method must be implemented in the Duck class.
3. The doAnotherAction () method in the Duck class should display the string "moving".
4. The move method in the Util class must call the doAnotherAction method on the object passed to it.
5. The Duck class must implement the Movable interface.
6. The Duck class must implement the Flyable interface.


 */

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements Flyable, Movable {
        @Override
        public void doAction() {
            System.out.println("flying");
        }

        @Override
        public void doAnotherAction() {
            System.out.println("moving");

        }
    }

    public static class Util {
        static void fly(Flyable animal) {
            animal.doAction();
        }

        static void move(Movable animal) {
            animal.doAnotherAction();
        }
    }

    public static interface Flyable {
        void doAction();
    }

    public static interface Movable {
        void doAnotherAction();
    }
}

