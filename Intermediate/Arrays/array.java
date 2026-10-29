package Intermediate.Arrays;

public class array {
    public static void main(String[] args) {
        // int nums[] = {3,7,2,4};

        // System.out.println(nums[0]);

        // when values are dynamic 
        int nums[] = new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;

        for(int i=0;i<=nums.length-1;i++){
            System.out.println(nums[i]);
        }

    }
}
