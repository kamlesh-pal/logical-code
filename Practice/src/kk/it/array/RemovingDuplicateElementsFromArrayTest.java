package kk.it.array;

import java.util.Arrays;

public class RemovingDuplicateElementsFromArrayTest {
    public static int[] removeDuplicatesElements(int[] duplicateArray){
        int arrLength = duplicateArray.length;
        for(int i=0; i<duplicateArray.length; i++){
            for(int j=i+1; j<arrLength; j++){
                if(duplicateArray[i] == duplicateArray[j]){
                    duplicateArray[j] = duplicateArray[arrLength-1];
                    arrLength--;
                    j--;
                }
            }
        }
        int[] uniqueElementArray = Arrays.copyOf(duplicateArray , arrLength);
         return uniqueElementArray;
    }
    public static void main(String[] args) {
        int[] duplicateArray = new int[]{2,4,1,10,2,3,6,4,3,2,6,55,44,33,44,33};
        int[] uniqueValue = RemovingDuplicateElementsFromArrayTest.removeDuplicatesElements(duplicateArray);
        for (int i=0; i<uniqueValue.length;i++){
            System.out.println(uniqueValue[i]);
        }
    }
}
