class Solution {
    public static int findMaxForN(Node root, int n) {
        int ans = -1;
        while(root!=null)
        {
            
            if(root.key > n ) 
             root = root.left;
            else if(root.key <= n )
            {
                ans = root.key;
                 root= root.right;
            }
            
            
        }
        return ans;
        
    }
}
