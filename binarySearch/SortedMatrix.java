package com.binarySearch;

import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(Arrays.toString(search(arr, 7)));

    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart)/2;

            if( matrix[row][cMid] == target ){
                return new int[]{row,cMid};
            }
            if( matrix[row][cMid] > target){
                cStart = cMid + 1;
            }else{
                cEnd = cMid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if(col == 0){
            return new int[]{-1, -1};
        }

        if(row == 1){
            return binarySearch(matrix, 0, 0, col, target);
        }

        int rStart = 0;
        int rEnd = row - 1;

        int cMid = col/2;

        while(rStart < (rEnd-1)){

            int mid = rStart + (rEnd - rStart)/2;

            if( matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if( matrix[mid][cMid] > target){
                rEnd = mid;
            }else{
                rStart = mid;
            }


        }

        // Now we have 2 rows

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart, cMid};
        }

        if(matrix[rStart][cMid - 1 ] >= target){
            return binarySearch(matrix, rStart,0 ,cMid - 1, target);
        }

        if(matrix[rStart][cMid + 1 ] <= target){
            return binarySearch(matrix, rStart,cMid + 1 ,col - 1, target);
        }

        if(matrix[rStart + 1][cMid + 1 ] <= target){
            return binarySearch(matrix, rStart + 1,cMid + 1 ,col - 1, target);
        }else{
            return binarySearch(matrix, rStart + 1,0 ,cMid - 1, target);
        }



    }


}
