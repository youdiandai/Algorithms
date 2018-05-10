package basis;

public class ArrayPractice {
    public static double findMaxInArray(double[] list) {
        double max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }

    public static double computeArrayAvg(double[] list){
        double sum = 0;
        for (int i =0;i<list.length;i++)
        {
            sum+=list[i];
        }
        return sum/list.length;
    }

    public static double[] copyArray(double[] list){
        double[] b;
        b= new double[list.length];
        for (int i=0;i<list.length;i++)
        {
            b[i]=list[i];
        }
        return b;
    }

    public static void main(String[] args) {
        double[] a = {10.2, 5.3, 5.6, 2.1, 3.4, 7.3, 4.3, 67.1, 12.5, 9.1};
        //test findMaxInArray
        System.out.println(findMaxInArray(a));
        //test computeArrayAvg
        System.out.println(computeArrayAvg(a));
        //test copyArray
        double[] b;
        b=copyArray(a);
        for (int i=0;i<a.length;i++){
            a[i]++;
        }
        for (int i =0;i<a.length;i++)
        {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
        for (int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
            System.out.print(" ");
        }


    }
}
