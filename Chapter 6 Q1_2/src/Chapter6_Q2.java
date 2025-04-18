public class Chapter6_Q2 {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(bingocnt(arr));

    }


    static int bingocnt (int[][] arr){
        int sum = 0;
        int count = 0;
        //가로
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                    if (sum == 5) {
                        count++;
                        sum = 0;
                    }

            }
        }
        //세로
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[j][i];
                if (sum == 5) {
                    count++;
                    sum = 0;
                }
            }
        }
            //대각선
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (sum == 5) {
                count++;
                sum = 0;
            }
            else sum = 0;
        }
            //반대 대각선
        for (int i = 0; i < arr.length; i++) {
            for (int j = 5; j <arr.length ; j--) {
                sum += arr[i][arr.length - 1 - i];
                if (sum == 5) {
                    count++;
                    sum = 0;
                }
                else sum = 0;
            }
        }
        return count;
    }
}

