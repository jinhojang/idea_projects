public class ArrayDemo {
    public static void main(String[] args){
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);

        byte[] anArrayOfBytes = {1,2,3,4,5,6,7};
        for( int i = 0; i<anArrayOfBytes.length; ++i) {
            System.out.println("anArrayOfBytes Element at index " + i + ": " + anArrayOfBytes[i]);
        }
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans = {true, false, false, true};
        int index = 0;
        for( boolean b: anArrayOfBooleans) {
            System.out.println("anArrayOfBooleans Element at index " + (index++) + ": " + b);
        }
        char[] anArrayOfChars = {'a', 'b', 'c', 'd', 'e', 'f'};
        for( int i = 0; i<anArrayOfChars.length; ++i) {
            System.out.println("anArrayOfChars Element at index " + i + ": " + anArrayOfChars[i]);
        }
        String[] anArrayOfStrings = {
                "a",
                "b",
                "c",
                "d",
                "e"
        };
        for( int i = 0; i<anArrayOfStrings.length; ++i) {
            System.out.println("anArrayOfStrings Element at index " + i + ": " + anArrayOfStrings[i]);
        }
    }
}
