import java.util.*;
class linearsearch{
    public static int searchandreturn_the_index(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){       // check for the target if found return it
                return i;
            }
        }
        return -1;           // not found the target return -1
    }

    public static boolean contains(int val,int[] arr){     // check for if the contains the value
        for(int i =0;i<arr.length;i++){
            if(val == arr[i]){
                return true;              // it found return true
            }
        }
        return false;                     // not found return false
    }

    public static int charcheck(String val,char target){
        for(int i=0;i<val.length();i++){
            if(val.charAt(i) == target){              // search for a single char in a string
                return i;
            }
        }
        return -1;
    }

    public static int[] twoDARRAY(int[][] kas,int target){
        for(int i=0;i< kas.length;i++){
            for(int j=0;j<kas.length;j++){
                if(kas[i][j] == target){                               // use linear approach to search a target in a 2Darray
                    return new int[]  {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }


}

public class LINEAR_SEARCH {
    static void main(String[] args){
        int[] kas = {2,3,4,5,6,6,7,74,3,21};
        int k = 74;
        System.out.println(linearsearch.searchandreturn_the_index(kas,k));
        linearsearch.contains(3,kas);
        String lkas = "kastro";
        System.out.println(linearsearch.charcheck(lkas, 's'));
        int[][] exam = { {2,3,4},{4,5,6},{9,8,7}};
        System.out.println(Arrays.toString((linearsearch.twoDARRAY( exam,4))));
    }

}
