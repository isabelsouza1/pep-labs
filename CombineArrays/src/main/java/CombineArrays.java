
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int leng = arr1.length + arr2.length;
        int j = arr1.length;
        int[] arr3 = new int[leng];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        
        for (int i = j; i < arr3.length; i++) {
            arr3[i] = arr2[i-j];
        }

        return arr3;
    }
}
