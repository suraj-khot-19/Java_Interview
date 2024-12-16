class Solution{
    public int element(int[] arr, int k){
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
public class Kth_Element {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,2,3,4,5,67};
        int solution=sol.element(arr,4);
        System.out.println(solution);
    }
}
