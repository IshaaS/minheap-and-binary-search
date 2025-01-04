class GFG
{
static int findmissing(int [] ar, int N)
{
    int low = 0;
    int high = N - 1;
    int mid = low + (high-low)/2;
    while(high-low>1){
        int midDiff = ar[mid] - mid;
        int highDiff = ar[high] - high;
        if(midDiff != highDiff) low = mid;
        else high = mid;
        mid = low + (high-low)/2;
    }
    return (ar[low]+ar[high])/2;
 }

public static void main(String [] args)
{
    int arr[] = {1, 2, 3, 4, 5, 7, 8};
    int N = arr.length;
    System.out.println(findmissing(arr, N));
}
}


