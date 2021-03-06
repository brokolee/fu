package adhoc9;

public class WeighableObjects {

  static class Animal implements Weighable {
       
        @Override
        public double getWeight() {
            return 42.5;
        }

        public void print() {
            System.out.println("Objekt: " + this.getClass().getName());
            System.out.println("Gewicht: " + this.getClass().getName());
        }
    }

    static class Apple implements Weighable {
        @Override
        public double getWeight() {
            return 5;
        }

        public void print() {
            System.out.println("Objekt: " + this.getClass().getName());
            System.out.println("Gewicht: " + this.getClass().getName());
        }
    }

    static class Hammer implements Weighable {
        @Override
        public double getWeight() {
            return 22;
        }

        public void print() {
            System.out.println("Objekt: " + this.getClass().getName());
            System.out.println("Gewicht: " + this.getClass().getName());
        }
    }

}
