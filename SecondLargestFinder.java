public class SecondLargestFinder {

        int findSecondLargest(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array must have at least two elements.");
                return -1;
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("All elements are the same.");
                return -1;
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 20, 40, 30, 40, 10};

            // Create object
            SecondLargestFinder obj = new SecondLargestFinder();

            int result = obj.findSecondLargest(numbers);
            System.out.println("Second largest number is: " + result);
        }
    }
