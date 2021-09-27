/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20arraypro;

import java.util.Arrays;



/**
 *
 * @author user
 */
public class SPTV20ArrayPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Массивы в Java
        int[] nums;
        nums = new int[5];
//        nums[0]=1;
//        nums[1]=2;
//        nums[2]=3;
//        nums[3]=4;
//        nums[4]=5;
        for(int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }
        //Вывод массива в консоль
        System.out.print("nums =  [");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //или так
        System.out.println("nums = "+Arrays.toString(nums));
        //Копированние массива
//        int[] nums2 = new int[7];
//        for(int i = 0;i<nums.length;i++){
//            nums2[i] = nums[i];
//        }
//        System.arraycopy(nums, 0, nums2, 0, nums.length);
        int[] nums2 = Arrays.copyOf(nums, 7);
        System.out.println("nums2 = "+Arrays.toString(nums2));
        nums = nums2;
        System.out.println("nums = "+Arrays.toString(nums));
        
        System.out.println("Многомерные массивы");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= i*j;
            }
        }
        int[] sumCols = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d",matrix[i][j]);
                sum += matrix[i][j];
                sumCols[j]+=matrix[i][j];
            }
            System.out.println(" | сумма строки = "+sum);
        }
        System.out.println("   --Сумма столбцов--");
        for (int i = 0; i < sumCols.length; i++) {
            System.out.printf("%4d",sumCols[i]);
        }
        System.out.println();
    }
    
}
