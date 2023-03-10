package Utils;

public class PrintArrayElements {
    public static void printIntArray(int[] initialArray) {
        for (int k : initialArray) {
            System.out.print("[" + k + "]" + "\t");
        }
    }

    public static void printDoubleArray(double[] initialArray) {
        for (double k : initialArray) {
            System.out.print("[" + k + "]" + "\t");
        }
    }
}