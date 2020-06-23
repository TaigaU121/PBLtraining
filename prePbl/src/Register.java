import java.util.HashMap;
import java.util.Map;

public class Register {
    public static void main(String[] args) {

        //Calcクラス（計算する）を生成
        Calc calc = new Calc();

        calc.setNum(1,2);
        calc.setNum(2,5);

        System.out.println((int)calc.sum(1.08,1,2));

    }
}
