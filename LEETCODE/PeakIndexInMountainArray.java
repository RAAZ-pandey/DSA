public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while( start < end ) {
           int mid = start + (end - start) / 2;

            if(arr[mid] > arr [mid + 1]) {
              //you are in decending part of the array
              //it may be probable answer
                end = mid;
            } else {
                start = mid + 1;  // or this is the answer if you are in acending part of the array
            }
        }
        return start; //here start and end both can be the answer as both indicate the same value
    }
}
