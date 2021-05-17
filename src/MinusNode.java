

public class MinusNode implements CommonNode {
    private final CommonNode left;
    private final CommonNode right;
    public MinusNode(CommonNode l, CommonNode r){
        this.left = l;
        this.right = r;
    }
    @Override
    public float calc(){
        return left.calc() - right.calc();
    }
    @Override
    public CommonNode getLeft(){
        return left;
    }
    @Override
    public CommonNode getRight(){
        return right;
    }
    @Override
    public String toString(){
        return "-";
    }
}
