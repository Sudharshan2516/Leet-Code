class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> in = new HashMap<>();
        for(int i = 0; i< inorder.length; i++){
            in.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder,0, preorder.length-1, inorder, 0, inorder.length-1, in);
        return root;
    }
    private TreeNode buildTree(int[] preorder, int preS, int preEn, int[] inorder, int inS, int inEn, Map<Integer, Integer> in){
        if(preS > preEn || inS > inEn){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preS]);
        int Iroot = in.get(root.val);
        int l = Iroot - inS;
        root.left = buildTree(preorder, preS+1, preS+l, inorder, inS, Iroot-1, in);
        root.right = buildTree(preorder, preS+l+1, preEn, inorder, Iroot+1, inEn, in);
        return root;
    }
}