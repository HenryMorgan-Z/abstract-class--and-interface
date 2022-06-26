package q1;

import java.util.ArrayList;
import java.util.List;

public class BuyChickens {

    /**
     * One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens. If you want to buy 100 of them with 100 yuan, how should you buy them?
     */

    public static void main(String[] args) {
        double money = 100;
        int num = 100;
        Cock cock = new Cock();
        Hen hen = new Hen();
        ThreeChickens threeChickens = new ThreeChickens();
        List<BuyChickensStrategy> buyChickensStrategyList = new ArrayList<>();
        // buy cock
        for (int i = 0; i < num; i ++) {
            // buy hen
            for (int j = 0; j < num - j; j++) {
                // buy threeChicken
                if (((num - i - j) % 3) == 0) {
                    if (i * cock.price + j * hen.price + ((num - i - j) / 3) * threeChickens.price < money) {
                        BuyChickensStrategy buyChickensStrategy = new BuyChickensStrategy();
                        buyChickensStrategy.cockNum = i;
                        buyChickensStrategy.henNum = j;
                        buyChickensStrategy.treeChickens = (num - i - j) / 3;
                        buyChickensStrategyList.add(buyChickensStrategy);
                    }
                }
            }
        }
        System.out.println("strategy num is " + buyChickensStrategyList.size());
        System.out.println(buyChickensStrategyList.toString());
    }
}
