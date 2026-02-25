/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();// arraylist m hamesha ; coolon   lgega ye nhi......
            if(root==null) return ans;
            Queue<TreeNode> q= new LinkedList<>();
            q.add(root);
           // List<Integer> list = new ArrayList<>();
            while(!q.isEmpty()){
                int size = q.size();
                 List<Integer> list = new ArrayList<>();
            for(int i =0; i<size ; i++){
                TreeNode current = q.poll();
                if(current.left != null) q.add(current.left);
                if(current.right !=null) q.add(current.right);

                list.add(current.val);

            }
            ans.add(list);
           // Collections.reverse(ans);
            
        
    }
    Collections.reverse(ans);
    return ans;
    }
}
