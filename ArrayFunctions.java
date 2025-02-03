import java.util.ArrayList;

class ArrayFunctions {
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array); // Using ArrayLists
    }

public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Even numbers:");
        display(even);
        System.out.println("Odd numbers:");
        display(odd); 
    }

public void difference(int[] array) {
        ArrayList<Integer> diff = new ArrayList<>();

        for (int j = 0; j < array.length - 1; j++) {
            diff.add(array[j] - array[j + 1]);
        }
        System.out.println("Differences:");
        display(diff); // Display method refers to the ArrayList diff

        int minIndex = 0;
        int minValue = diff.get(0);

        for (int i = 1; i < diff.size(); i++) {
            if (diff.get(i) < minValue) {
                minValue = diff.get(i);
                minIndex = i;
            }
        }
        System.out.println("Smallest Index: " + (minIndex + 1));
    }
}
