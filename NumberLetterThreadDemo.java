public class NumberLetterThreadDemo {
    static class NumTask extends Thread {
        public void run() {
            for (int x = 1; x <= 5; x++) {
                System.out.println("Number: " + x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("NumTask interrupted");
                }
            }
        }
    }

    static class LetterTask implements Runnable {
        public void run() {
            for (char ch = 'A'; ch <= 'E'; ch++) {
                System.out.println("Letter: " + ch);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("LetterTask interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread tNum = new NumTask();
        Thread tLetter = new Thread(new LetterTask());

        tNum.start();
        tLetter.start();

        try {
            tNum.join();
            tLetter.join();
        } catch (InterruptedException ex) {
            System.out.println("Main interrupted");
        }

        System.out.println("Both threads completed");
    }
}