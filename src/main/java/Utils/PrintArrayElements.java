package Utils;

public class PrintArrayElements {
    public static void printIntArray(int[] initialArray) {
        System.out.println();
        for (int k : initialArray) {
            System.out.print("[" + k + "]" + "\t");
        }
    }

    public static void printDoubleArray(double[] initialArray) {
        System.out.println();
        for (double k : initialArray) {
            System.out.print("[" + k + "]" + "\t");
        }
    }
}