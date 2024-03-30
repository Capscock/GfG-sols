class Solution {
   
    int minValue(Node root) {
        
         if(root == null) return -1;
        Node prev = null;
        
        while(root != null){
            prev = root;
            root = root.left;
        }
        
        return prev.data;
    }
}
