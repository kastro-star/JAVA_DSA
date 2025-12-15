import java.util.Arrays;

class bubblesorting{                 // BUBBLE SORTING
    public static int[] sortttting(int[] kas){              // bubble sort is an stable sort
        for(int i=1;i<kas.length ;i++){               // START TO COMPARE FROM FROM THE FIRST ELEMET
            for(int j=0;j < kas.length - i;j++){       // ALWAYS COMPARE THE FIRST ELEMENT TO (N-I) DECREASE THE SIZE OF THE ARRAY FOM LAST IN INNER LOOP BECAUSE IN NEXT NEXT ITH ITERATIONS IT DEFINITLY BEING SORTED
                if(kas[j] > kas[j+1]){
                    int temp = kas[j+1];            // if try to make them O(N)  use BOOLEAN OPERATOR to make break doen CHeck the array is sorted or not
                    kas[j+1] = kas[j];
                    kas[j] = temp;
                }
            }
        }
        return kas;
    }
}


public class BUBBLE_SORT {
    static void main(String[] args) {
        int[] arr = {12,54,76,34,12,7,1};
        System.out.println(Arrays.toString(bubblesorting.sortttting(arr)));
    }
}
