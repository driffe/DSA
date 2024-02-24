

public class minDepthOfBtree {
    int val;
    minDepthOfBtree left;
    minDepthOfBtree right;
    minDepthOfBtree() {}
    minDepthOfBtree(int val) { this.val = val; }
    minDepthOfBtree(int val, minDepthOfBtree left, minDepthOfBtree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static void main(String[] args) {
        
    }
    public int minDepth(minDepthOfBtree root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) {
            return left + right + 1;
        } else {
            return Math.min(left,right) + 1;
        }
    }
}
