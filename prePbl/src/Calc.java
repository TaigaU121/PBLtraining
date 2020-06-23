import java.util.HashMap;
import java.util.Map;

public class Calc {
    // 商品のidと価格を紐付けたHashMapを定義
    private HashMap<Integer, Integer> idPriceMap;
    // 商品のidと個数を紐づけたHashMapを定義
    private HashMap<Integer, Integer> idNumMap;

    // コンストラクタの定義
    public Calc() {

        // ２つのHashMapを初期化（これしないとNullPointException）
        idPriceMap = new HashMap<>();
        idNumMap = new HashMap<>();

        // 商品idと単価は固定なので、初期化時点で紐付け
        idPriceMap.put(1,100);
        idPriceMap.put(2,40);
        idPriceMap.put(3,150);
        idPriceMap.put(4,350);
        idPriceMap.put(5,400);
        idPriceMap.put(6,420);
        idPriceMap.put(7,440);
        idPriceMap.put(8,100);
        idPriceMap.put(9,80);
        idPriceMap.put(10,100);

        // 商品は後のsum関数の引数にidがあった場合に個数1となるよう初期化
        idNumMap.put(1,1);
        idNumMap.put(2,1);
        idNumMap.put(3,1);
        idNumMap.put(4,1);
        idNumMap.put(5,1);
        idNumMap.put(6,1);
        idNumMap.put(7,1);
        idNumMap.put(8,1);
        idNumMap.put(9,1);
        idNumMap.put(10,1);
    }

//    補講1
//    public int sum(int goods1,int goods2){
//        return idPriceMap.get(goods1) + idPriceMap.get(goods2);
//    }

//    補講2
//    public int sum(int ... goodsId){
//        int sum = 0;
//        for(int elemGoods:goodsId){
//            sum += idPriceMap.get(elemGoods);
//        }
//        return sum;
//    }

    //   お題１
    public void setNum(int goodsId,int purchaseNum){
        idNumMap.put(goodsId,purchaseNum);
    }

    public int sum(int ... goodsIds){
        int sum = 0;
        for(int GoodsId:goodsIds){
            sum += idPriceMap.get(GoodsId) * idNumMap.get(GoodsId);
        }
        return sum;
    }

    public double sum(double taxRate, int ... goodsIds){
        int sum = 0;
        for(int GoodsId:goodsIds){
            sum += idPriceMap.get(GoodsId) * idNumMap.get(GoodsId);
        }
        return Math.floor(sum * taxRate); //呼び出し元で(int)とキャストしている（つまり切り捨てが行われている）のでMath.floorは不要だが勉強のため。
    }

}
