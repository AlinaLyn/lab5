public class task2 {
    public static void main(String[] args) {

        int[] array = new int[20];
        int i;
        for(i = 0; i < array.length; i++){
            array[i]=(int)(Math.random()*10.0);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (i = 0; i < array.length; i += 2){
            array[i] =0;
        }
        for(i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        }

    }
