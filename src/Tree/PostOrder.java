package Tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    List<Integer> res = new ArrayList<>();

    public List<Integer> postOrder(TreeNode root) {
        if (root == null) return res;


        postOrder(root.left);
        postOrder(root.right);
        res.add(root.val);

        return res;
    }
}
