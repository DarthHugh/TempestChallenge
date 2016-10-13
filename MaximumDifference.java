/**
 * 
 * @author Hugo Correia
 * Question 1
 */
class MaximumDifference{
    
    int maxDifference(int a[], int size){
        int max_diff = a[1] - a[0];
        int i, j;
        for (i = 0; i < size; i++){
            for (j = i + 1; j < size; j++){
                if (a[j] - a[i] > max_diff)
                    max_diff = a[j] - a[i];
            }
        }
        return max_diff;
    }
}
 