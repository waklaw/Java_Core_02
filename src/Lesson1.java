public class Lesson1 {

    byte a = 1;
    short b = 2;
    int c = 3;
    long d = 400000000000000l;
    float e = 5.5f;
    double f = 6.6;
    char g = 700;
    boolean h = true;

    public static void main(String[] args){
        System.out.println("Byte: min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE);
        System.out.println("Short: min: " + Short.MIN_VALUE + " max: " + Short.MAX_VALUE);
        System.out.println("Integer: min: " + Integer.MIN_VALUE + " max: " + Integer.MAX_VALUE);
        System.out.println("Long: min: " + Long.MIN_VALUE + " max: " + Long.MAX_VALUE);
        System.out.println("Float: min: " + Float.MIN_VALUE + " max: " + Float.MAX_VALUE);
        System.out.println("Double: min: " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE);
        System.out.println("Character: min: " + Character.MIN_VALUE + " max: " + Character.MAX_VALUE);
        System.out.println("Boolean: is not specified");
        System.out.println();

        int arr[] = {1,3,60,-23,11,34,86,-99,150,48};

        //привласнюємо перший елемент до найбільш. та найменш.
        int smallest = arr[0];
        int largest = arr[0];

        for(int i=1; i< arr.length; i++)
        {
            //порівняння сусідніх елементів
            if(arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("The largest number in the array: " + largest);
        System.out.println("The smallest number in the array: " + smallest);
    }
}
