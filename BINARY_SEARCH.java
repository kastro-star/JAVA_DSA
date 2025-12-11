//BINARY SEARCH IS ONE OF THE BEST SEARCH BECAUSE ITS 
//TIME COMPLEXITY IS O(LOG N) 
//LINEAR SEARCH TIME COMPLEXITY IS O(N) -- ITERATE THROUGH ALL THE ELEMENTS IN THE UNTILL FIND THE ELEMENT IT DOES NO SUITABLE FOR BIGGER LIKE 1000000 INDEXES ;
// SO BINEARY SERCH IS THE BEST THAT NOT ITERATE THROUGH ALL SO ITS RUN IN O(LOG N)


// BINARY SEARCH
             // BEST SUITBALE FOR SMALLER BIGGER ARRAYS O(LOG N)

                    //BEST CASE -- DIECTLY FOUND THE TARGET IN THE MID  -- O(1)
                    //AVERAGE CASE : O(LOG N)
                    //WORST CASE:
                        // ✔ O(log n)

                        // Binary Search reduces the search space by half each time:
                        // n → n/2 → n/4 → n/8 → ... → 1
                        // Number of steps ≈ log₂(n)
                        //SO O(LOG N)


class search{
    public static int ascendingsearch(int[] arr ,int target){   // binary search (find the target in the ascending wise sorted array
        int start =0,end = arr.length - 1;        // start and end values of the array
        while(end >= start){                 // if not the target present in the array it becomes false
            int mid = (start+end )/ 2;            //middle element of the each start and end points
            if(target == arr[mid]){
                return mid;                          // if mid is the target return
            } else if (target > arr[mid]) {     // if target is greater change the middlie to the next index (+1)
                start = mid +1;
            }else{
                end = mid -1;                     // if target less than the middle change middle to the index(-1)
            }
        }
        return -1;
    }
    public static int descendingorder(int[] arr,int target){       // exactly same as before for decending wise sorted array
        int start = arr.length-1,end = 0;                             // start from last index         end comes from index 0
        while(end <= start){
            int mid = (start + end)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {                         // if target is greater move mid to backwrd
                start = mid -1;
            }
            else{
                end = mid+1;                                        // if target is smaller move miid forward (because its an decending order)
            }
        }
        return  -1;
    }





    /// KUNAL KUSHWAHA LEET BINARY APPROACH PROBLEMS
    /// ALWAYS USE BINARY SEARCH FOR SORTED ARRAY --




    public static int ceiling(int[] arr,int target){      // to get the smallest maximum of the target value or equals to the target
        int start =0,end = arr.length -1;
        if(target > arr[end]){
            return  -1;
        }
        while(start <= end){
            int mid = (start + end )/2;
            if( target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static int floor(int[] arr ,int target){
        int start =0,end =arr.length -1;                 // to get the largest smaller or equal value to the target
        if(arr[end] < target){
            return -1;
        }
        while(start <= end){
            int mid = (start+end) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return end;
    }
}

public class BINARY_SEARCH{
    public static void main(String[] args){
        int[] kasr ={1,2,3,4,5,6,7,8,10};
        int[] revcheck = {9,8,7,6,5,4,3,2,1};
        int target = 5;
        search kas = new search();
        System.out.println(kas.ascendingsearch(kasr,target));
        System.out.println(kas.descendingorder(revcheck,target));
        System.out.println(kas.ceiling(kasr,9));
        System.out.println(kas.floor(kasr,9));


    }
}










//                              LEETCODE KUNAL KUSHWAHA BINARY APPROACH








//Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//        int start = 0,end = letters.length - 1;
//        if(target > letters[letters.length -1 ]){
//            return letters[0];
//        }
//        while(start <= end){                           // NOTE : LEETCODE PROBLEM FOR FIND THE SMALLEST GREATER ELEMENT THAN THE TARGET
//            int mid = (start +end) /2;
//            if(target < letters[mid]){
//                end = mid -1;
//
//            }
//            else{
//                start = mid + 1;
//            }
//
//        }
//        return letters[start % letters.length];           // will mark the o th index of the array  start =4 and letters.length =4   4%4 =0;
//    }
// }


//PROBLEM NO 2 LEETCODE NO :34
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int kas[] ={-1,-1};
//        int start = search(nums,target,true);
//        int end = search(nums,target,false);
//        kas[0]=start;
//        kas[1]=end;
//        return kas;
//    }
//    public int search(int nums[],int target,boolean searchforward){ // search for the mid value and return the most forwarded and backward index of the taget
//        int ans =-1,start =0,end= nums.length -1;
//        while(start <= end){
//            int mid = (start +end )/ 2;
//            if(target < nums[mid]){
//                end = mid -1;
//            }                                // Normal binary search
//            else if(target > nums[mid]){
//                start = mid+1;
//            }
//            else{
//                ans = mid;                    // if it found the mid value equals to the target store in ans
//                if(searchforward){            // if the paramter is true if to search   <--------mid  left of the possible first occurence
//                    end = mid -1;
//                }
//                else{
//                    start = mid+1;            // if the the parameter if false tasks to find the  mid--------> right side (last )of the possible target
//                }
//            }
//        }
//        return ans;                           // returns the fist (true)   last (false) based on the parameter
//    }
//}











//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//Return the index of the peak element.
//
//Your task is to solve it in O(log(n)) time complexity.



//Example 1:
//
//Input: arr = [0,1,0]
//
//Output: 1
//
//Example 2:
//
//Input: arr = [0,2,1,0]
//
//Output: 1
//
//Example 3:
//
//Input: arr = [0,10,5,2]

//Output: 1

//class Solution {
//    public int peakIndexInMountainArray(int[] arr) {      find the largest elemnt in the array contains both ascending and descending in the same array
//        int start =0,end = arr.length - 1;
//        while(start < end){                            if start and end paced in the same index loop will break
//            int mid = (start + end)/2;
//            if(arr[mid] > arr[mid + 1]){              for checks the descending order of the array and assign end = mid
//                end = mid;
//            }
//            else{
//                start = mid +1;                increasing forward
//            }
//        }
//        return start;                      start and end will be the same you will return any answer will point at the answer(largest element in the array)
//    }

//}

