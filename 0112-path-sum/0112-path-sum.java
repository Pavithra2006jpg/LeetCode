
//TOP DOWN APPROACH :

/*
    1.Initially i am setting traversal(root, 0, targetSum); sum=0
    2.at the each level of Recursive call , i am adding curr.val and sum which we captured previously.
    3.At the end of the leaf node , curr sum will be equal to targetSum.
*/

class Solution {
    boolean ans = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }

        traversal(root, 0, targetSum);

        return ans;

    }

    public void traversal(TreeNode curr, int sum, int targetSum) {
        int newSum = sum + curr.val;

        if (curr.left == null && curr.right == null) {
            if (newSum == targetSum) {
                ans = true;
            }
        }

        if (curr.left != null) {
            traversal(curr.left, newSum, targetSum);
        }
        if (curr.right != null) {
            traversal(curr.right, newSum, targetSum);
        }
    }
}

