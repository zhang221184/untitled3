package Cycle;

public class Cycle {

        public void play() {
            System.out.println("Cycle");
        }
        public void wheels(){
            System.out.println("轮子的数量是"+"num");
        }
    }
    class Unicycle extends Cycle {
        public void play() {
            System.out.println("Unicycle");
        }
        public void wheels(){
            System.out.println("Unicycle wheels:4");
        }
    }

    class Bicycle extends Cycle {
        public void play() {
            System.out.println("Bicycle");
        }
        public void wheels(){
            System.out.println("Bicycle wheels:2");
        }
    }

    class Tricycle extends Cycle {
        public void play() {
            System.out.println("Tricycle");
        }
        public void wheels(){
            System.out.println("Tricycle wheels:3");
        }
    }
    class Ride {
        public static void ride(Cycle cycle) {
            cycle.play();
        }

        public static void main(String[] args) {
            Unicycle unicycle = new Unicycle();
            Bicycle bicycle = new Bicycle();
            Tricycle tricycle = new Tricycle();
            ride(unicycle);
            ride(bicycle);
            ride(tricycle);
            unicycle.wheels();
            bicycle.wheels();
            tricycle.wheels();

        }
    }



