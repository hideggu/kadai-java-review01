
public class Review01 {

    public static void main(String[] args) {
        // 商品価格を定義する
        int price = 1500;
        // 消費税額を計算するメソッドを呼び出す
        int tax = tax(price);
        // 戻り値を利用して、税込み価格を計算する
        int priceIncludingTax = price + tax;
        // 結果を表示する
        System.out.println(price + "円の商品の税込価格は" + priceIncludingTax + "円（消費税は" + tax + "円）です。" );
    }
    //　taxメソッドを開始する
    public static int tax(int price) {
        // 消費税率を定める(doubleで小数点以下まで指定）
        double taxRate = 0.1;
        //　消費税額を計算する（doubleで小数点以下まで計算される）
        double taxAmount = price * taxRate;
        // 戻り値が整数値になるようにintに指定
        return (int) taxAmount;
    }

}
