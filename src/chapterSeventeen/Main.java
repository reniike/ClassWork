package chapterSeventeen;

public class Main {
    public static void main(String[] args) {
        CarMethod carMethod = new CarMethod() {
            @Override
            public void stop() {
                System.out.println("Uncle stop touching...");
            }

            @Override
            public void move() {
                System.out.println("Madam stop moving...");
            }
        };

//        anonymous class is a sub inner class
        carMethod.stop();
        carMethod.move();

    }
}
