package PGM;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp = {-1};
        
        if ( arr.length == 1) {
            return temp;
        }
        
        int min = arr[0];
        
        for ( int i = 1; i < arr.length; i++ ) {
            if ( min > arr[i] ) {
                min = arr[i];
            }
        }
        
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] == min) {
                arr[i] = -1;
            }
        }
        
        int[] result = new int[arr.length-1];
            
        for ( int i = 0, j = 0; i < arr.length; i++ ) {
            if ( arr[i] != -1) {
                result[j] = arr[i];
                j++;
            }
        }
        
        answer = result;
        
        return answer;
    }
}