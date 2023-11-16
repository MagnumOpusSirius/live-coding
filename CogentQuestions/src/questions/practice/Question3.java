package questions.practice;

/*
How to do tree traversal?
Three types we have:
- inorder
- postorder
- preorder
 */
class Question3 {
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);

        System.out.println("Inorder traversal: ");
        question3.inorderTraversal(root);

        System.out.println("\nPostorder traversal: ");
        question3.postorderTraversal(root);

        System.out.println("\nPreorder traversal: ");
        question3.preorderTraversal(root);
    }
}
