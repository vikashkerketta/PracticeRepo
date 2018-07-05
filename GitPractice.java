
import java.io.*;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class Solution {
	 Solution() {
		
	}
	int example=3;
//	Solution(int r){
//		example= r;
//		System.out.println("You have got a solution object example: "+example);
//	}

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
    
/*
 * list<integer>={2,4,7,7,9};
 * list<integer> ={3,4,7};
 * o/p should be 4,7
 * for(int i:B){
 *   if i in A:
 *     C.add(i);
 *     A.remove(i); 2,7,9
 * 
 */
     
     

     
   /*public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
    		//Comparator<String> comparator = new ValueComparator(map);
    		//TreeMap is a map sorted by its keys. 
    		//The comparator is used to sort the TreeMap by keys. 
    		//TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
    		//result.putAll(map);
   }*/
    		//return result;
    
    
    
    
    public static void main(String[] args) throws Exception {
   //Solution newSol= new Solution();
    	Integer i = new Integer(20);
        int x = i;
        System.out.println("the value of i is:"+x);
        
   /*HashMap<String, Integer> map = new HashMap<String, Integer>();
	map.put("a", 10);
	map.put("b", 30);
	map.put("c", 50);
	map.put("d", 40);
	map.put("e", 20);
	System.out.println(map);

	TreeMap<String, Integer> sortedMap = sortMapByValue(map);  
	System.out.println(sortedMap);*/
   //System.out.println("new string is : "+newStr);
   
   //int[] A= {2,4,6,1,7} , sum = 8;
  // System.out.println("The pairs are: "+ newSol.twoSum1(A, sum));
	
	}
}