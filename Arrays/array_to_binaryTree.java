public class array_to_binaryTree<TreeNode> {
  class TreeNode{
    int data;
    TreeNode next;
  }
    public TreeNode sortedArrayToBST(int[] nums) {
          if (nums.length == 0) {
            
        return null;
    }

    TreeNode head = helper(nums, 0, nums.length - 1);
    return head;
    
    
}

public TreeNode helper(int[] nums, int low, int high) {
    if (low > high) { 
      
        return null;

    }

    int mid = (low + high) / 2;
    TreeNode node = new TreeNode();
    node.next = helper(nums, low, mid - 1);
    node.next = helper(nums, mid + 1, high);
    return node;
    
}
    }