public class Chapter6_Q1 {
    public static void main(String[] args) {
        System.out.println(mid(1, 2, 3));
        System.out.println(mid(2, 1, 3));
        System.out.println(mid(1, 2, 2));
        System.out.println(mid(1, 1, 2));
        System.out.println(mid(3, 3, 2));
        System.out.println(mid(5, 2, 3));
    }


    static int mid (int n1, int n2, int n3) {
        int middle = 0;
        if ((n1 >= n2 && n1 <= n3) || n1 <= n2 && n1 >= n3) middle = n1;
        else if ((n2 >= n1 && n2 <= n3) || (n2 <= n1 && n2 >= n3)) middle = n2;
        else middle = n3;
        return middle;
    }
}
