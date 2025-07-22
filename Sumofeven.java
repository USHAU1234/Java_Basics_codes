public class Sumofeven {

    int Sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Sumofeven obj = new Sumofeven();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("The Sum of the Even number is: "+obj.Sum(arr));


    }
}