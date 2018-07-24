
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class Solution {
	 Solution() {
		
	}

//. given a number1 and sum=number1+number2, function to find the number2 in a list.
    public void twoSum(int[] nums, int target) {
        int Arr_len= nums.length;
        HashMap<Integer,Integer> Arr_Store = new HashMap<Integer,Integer>();
        for (int i=0; i<Arr_len; i++){
           Arr_Store.put(nums[i],i); 
        }

        for (int j=0;j<Arr_len; j++) {
        	if (Arr_Store.containsKey(target-nums[j])) {
        		System.out.println("The pairs are :"+nums[j]+" " + (target-nums[j]));
        		Arr_Store.remove(nums[j]);
        		System.out.println("The keySet is: "+Arr_Store.keySet());
        	}
        }
        
    }
    //overloading
    public int twoSum(int[] a, int b, int c) {
    	return b+c;
    }
//	Given two lists/arrays, find the intersection of two lists.
    public int[] intersect(int[] nums1, int[] nums2) {
    	HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
    	for (int n : nums1) { numbers.put(n,numbers.getOrDefault(n, 0)+1); }
    	int[] res = new int[nums1.length+nums2.length];
    	int cursor = 0;
    	for (int n : nums2) {
    	if (numbers.getOrDefault(n,0)!=0) {
    	res[cursor++] = n;
    	numbers.put(n,numbers.getOrDefault(n,0)-1);
    	}
    	}
    	return Arrays.copyOfRange(res,0,cursor);
    	}
    
    
    
    
    public static void main(String[] args) throws Exception {
// Solution newSol= new Solution();
    	Integer i = new Integer(20);
        int x = i;
        System.out.println("the value of i is:"+x);
        
	
	}
}