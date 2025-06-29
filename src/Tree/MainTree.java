package Tree;

public class MainTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));

        SumOfAllEle obj = new SumOfAllEle();
        PreOrder obj1 = new PreOrder();
        InOrder obj2 = new InOrder();
        PostOrder obj3 = new PostOrder();

        System.out.println( "Sum Of All Elements"+" "+ obj.sumOfElements(head));

        System.out.println( "PreOrder"+" "+ obj1.preOrder(head));

        System.out.println( "InOrder"+" "+ obj2.inOrder(head));

        System.out.println( "PostOrder"+" "+ obj3.postOrder(head));

    }
}
