class Bow {
    private int b = 1526; // private instance variable

    public void run() {
        System.out.println("Outer class Hi");

        class LocalClass { // Local inner class defined within the run() method
            void meow() {
                System.out.println("The value of b is: " + b);
            }
        }

        LocalClass l = new LocalClass();
        l.meow();
    }

    public static void main(String args[]) {
        Bow e = new Bow();
        e.run();
    }
}
/*
Outer class Hi
The value of b is: 1526
*/
