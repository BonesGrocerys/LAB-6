import java.util.Scanner;
public class MainClass{
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("1 → (a-b)/(c-d)");
        System.out.println("2 → (a/b)-(c/d)");
        int choise = console.nextInt();
        System.out.println("Введите a, b, c и d");
        CommonNode cn;
        if (choise == 1){
            cn = new DevideNode(
                    new MinusNode(
                            new SmplNode(console.nextFloat()),new SmplNode(console.nextFloat())
                    ), new MinusNode(
                    new SmplNode(console.nextFloat()),new SmplNode(console.nextFloat())
            )
            );
        }
        else{
            cn = new MinusNode(
                    new DevideNode(
                            new SmplNode(console.nextFloat()),new SmplNode(console.nextFloat())
                    ), new DevideNode(
                    new SmplNode(console.nextFloat()),new SmplNode(console.nextFloat())
            )
            );
        }
        System.out.println("***Дерево***");
        output(0,cn);
        System.out.println("Результат операций = " + cn.calc());
    }
    private static void output(int ofs, CommonNode v){
        if (v != null){
            for (int i = 0; i < ofs; i++){
                System.out.print(" ");
            }
            System.out.println(v.toString());
            output(ofs + 2, v.getLeft());
            output(ofs + 2, v.getRight());
        }
    }
}

