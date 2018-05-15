package basis;

public class TwoDimensionalBooleanArry {
    public static void TwoDimensionalBooleanArry(Boolean[][] a) {
//        1.1.11 打印一个二维布尔类型数组
        System.out.print(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static int lg(int N) {
//        1.1.14 实现求log2N
        int max = 1;
        if (N < 2) {
            return -1;
        }
        int j = 2;
        while (true) {
            if (j * 2 <= N) {
                j *= 2;
                max += 1;
            } else {
                return max;
            }
        }
    }
    public static int[] histogram(int[] a,int M)
    {
//        1.1.15
        int [] b =new int[M];
        for(int i=0;i<M;i++)
        {
            b[i]=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==i+1)
                {
                    b[i]+=1;
                }
            }
        }
        return b;
    }
    public static String exR1(int n)
    {
        if (n<=0) return "";
        return exR1(n-3) + n + exR1(n-2)+n;
    }
    public static int mystery(int a,int b)
    {
        if(b ==0) return 1;
        if(b%2==0) return mystery(a*a,b/2);
        return mystery(a*a,b/2)*a;
    }



    public static void main(String[] args) {
        Boolean[][] a;
        a = new Boolean[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    a[i][j] = true;
                } else {
                    a[i][j] = false;
                }

            }
        }
        TwoDimensionalBooleanArry(a);
        System.out.println(lg(1));
        System.out.println(lg(4));
        System.out.println(lg(5));
        int[] test = {1,2,3,4,5,4,3,2,1};
        int[]  b= histogram(test,6);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println(exR1(6));
        System.out.println(exR1(6));
        System.out.println(mystery(2,25));
        System.out.println(mystery(3,11));
    }
}
