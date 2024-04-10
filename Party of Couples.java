class Solution{
    static int findSingle(int n, int arr[]){
        // code here
        int single = 0;
        
        for(int num : arr)
        {
            single ^= num;
        }
        return single;
    }
}
