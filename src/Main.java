
public class Main {

    public static int[] arrayRotate(int originalArray[] , int numberOfRotations){
        numberOfRotations %= originalArray.length;
        while (numberOfRotations > 0){
            int firstElement = originalArray[originalArray.length - 1];
            for (int iterator =  originalArray.length -1 ; iterator >= 1; iterator--){
                originalArray[iterator] = originalArray[iterator-1];
            }
            originalArray[0] = firstElement;
            numberOfRotations--;
        }
        return originalArray;
    }

    public static void main(String[] args) {
        int finalArray[] = arrayRotate(new int[]{2,5,6}, 1);
        for (int elements : finalArray){
            System.out.print(elements + " ");
        }
    }
}