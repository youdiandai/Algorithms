package basis;

public class HellowWorld {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int[] b;
        b = new int[100];
        for (int i = 0; i < 100; i++) {
            b[i] = i+1;
        }
        for (int i=0;i<100;i++){
            System.out.println(b[i]);
        }
        System.out.println("hello world");

    }
}
