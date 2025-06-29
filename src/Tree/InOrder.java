package Tree;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    List<Integer> res = new ArrayList<>();

    public List<Integer> inOrder(TreeNode root) {
        if (root == null) return res;

        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);

        return res;
    }
}
