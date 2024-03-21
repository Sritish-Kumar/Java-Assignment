package Rev;

public class StocksSell {
    static int[] values = { 7, 1, 5, 3, 6, 4 };
    static int len = values.length;

    public static void main(String[] args) {
        int profit = 0;

        for (int i = 0; i < len; i++) {
            int buy = values[i];
            int temp = 0;
            for (int j = i + 1; j < len; j++) {
                if (values[j] - buy > temp) {
                    temp = values[j] - buy;
                }

            }
            if (temp > profit) {
                profit = temp;

            }

        }
        System.out.println(profit);

    }
}
