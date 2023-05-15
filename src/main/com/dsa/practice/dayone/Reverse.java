package main.com.dsa.practice.dayone;

public class Reverse {

    public static void main(String[] args){
        int[] input=new int[]{1,2,3};
        display(input);
        int[] output=reverseArray(input);
        display(output);

        input=new int[]{1,3,5,2};
        display(input);
        output=reverseArrayRecursive(input,0,3);
        display(output);
    }

    /**
     * time complexity : O(n)
     * @param input
     * @return
     */
    public static int[] reverseArray(int[] input){
        int i=0;
        int j=input.length-1;
        while(i<j){
            int t=input[i];
            input[i]=input[j];
            input[j]=t;
            i++;
            j--;
        }
        return input;
    }

    /**
     * time complexity : O(n)
     * @param input
     * @param start
     * @param end
     * @return
     */
    public static int[] reverseArrayRecursive(int[] input, int start, int end){
        if(start>=end){
            return input;
        }
        int t=input[start];
        input[start]=input[end];
        input[end]=t;
        return reverseArrayRecursive(input,start+1,end-1);
    }

    public static void display(int[] input){
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}
