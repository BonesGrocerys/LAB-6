public class SmplNode implements CommonNode {
    private final float value;
    public SmplNode(float value){
        this.value=value;
    }
    @Override
    public float calc(){
        return this.value;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
    @Override
    public CommonNode getLeft(){
        return null;
    }
    @Override
    public CommonNode getRight(){
        return null;
    }
}
