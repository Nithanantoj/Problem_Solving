package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {

    List<Integer> res = new ArrayList<>();

    public List<Integer> preOrder(TreeNode root){
        if(root == null) return res;

        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);

        return res;
    }
}
