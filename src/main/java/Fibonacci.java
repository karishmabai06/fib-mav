public class Fibonacci {
    public String series(int count) {
        StringBuilder result = new StringBuilder();
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            if (i > 0) result.append(" ");
            result.append(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return result.toString();
    }
 
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.series(7));
    }
}
