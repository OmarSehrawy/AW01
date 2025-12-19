package ArrayWork;
public class ArrayWork {
    public static int[] delete(int[] v, int index){
        int[] n = new int[v.length - 1];
        for (int i = 0; i < v.length; i++) {
            if (i < index) {
                n[i] = v[i];
            } else if (i == index) {
                continue;
            } else {
                n[i - 1] = v[i];
            }
        }
        return n;
    }
    public static int[] insert(int[] v, int index, int value) {
        int[] n = new int[v.length+1];
        for (int i = 0; i < n.length; i++) {
            if (i < index) {
                n[i] = v[i];
            } else if (i == index) {
                n[i] = value;
            } else {
                n[i] = v[i - 1];
            }
        }
        return n;
    }
    public static void print(int[] v) {
        for (int x : v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static double[] delete(double[] v, int index){
        double[] n = new double[v.length - 1];
        for (int i = 0; i < v.length; i++) {
            if (i < index) {
                n[i] = v[i];
            } else if (i == index) {
                continue;
            } else {
                n[i - 1] = v[i];
            }
        }
        return n;
    }
    public static double[] insert(double[] v, int index, double value) {
        double[] n = new double[v.length+1];
        for (int i = 0; i < n.length; i++) {
            if (i < index) {
                n[i] = v[i];
            } else if (i == index) {
                n[i] = value;
            } else {
                n[i] = v[i - 1];
            }
        }
        return n;
    }
    public static void print(double[] v) {
        for (double x : v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static char[] delete(char[] v, int index){
        char[] n = new char[v.length - 1];
        for (int i = 0; i < v.length; i++) {
            if (i < index) {
                n[i] = v[i];
            } else if (i == index) {
                continue;
            } else {
                n[i - 1] = v[i];
            }
        }
        return n;
    }
    public static char[] insert(char[] v, int index, char value) {
        char[] n = new char[v.length+1];
        for (int i = 0; i < n.length; i++) {
            if (i < index) {
                n[i] = v[i];
            } else if (i == index) {
                n[i] = value;
            } else {
                n[i] = v[i - 1];
            }
        }
        return n;
    }
    public static void print(char[] v) {
        for (char x : v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}