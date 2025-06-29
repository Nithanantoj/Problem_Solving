package Tree;

public class SumOfAllEle {
    public int sumOfElements(TreeNode root){

        if(root == null){
            return 0;
        }

        int ls = sumOfElements(root.left);
        int rs = sumOfElements(root.right);

        return ls + rs + root.val;
    }
}
