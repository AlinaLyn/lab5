

public class Main {
    public static void main(String[] args) {
        //Task1
        int[] arr = new int[50];
        for (int i=1,a = 0;a< 50; i += 2,a++) {
            arr[a] = i;
            System.out.println(arr[a]);
        }
    }
}
