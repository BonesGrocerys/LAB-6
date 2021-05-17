public class DevideNode implements CommonNode {
    private final CommonNode left;
    private final CommonNode right;
    public DevideNode(CommonNode l, CommonNode r){
        this.left = l;
        this.right = r;
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
    public float calc(){
        if (right.calc() == 0){
            System.out.println("Попытка деления на 0");
            System.exit(0);
        }
        if (left.calc() == 0) return 0;
        return left.calc()/right.calc();
    }
    @Override
    public String toString(){
        return "/";
    }
}
