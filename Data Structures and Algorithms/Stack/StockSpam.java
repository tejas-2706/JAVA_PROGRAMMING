import java.util.Stack;
// Stock Span Problem
public class StockSpam {
    public static void stockspan(int Stocks[], int Span[]) {
        Stack<Integer> s = new Stack<>();
        Span[0] = 1;
        s.push(0);
        for (int i=1; i<Stocks.length; i++) {
            int currPrice = Stocks[i];
            while(!s.isEmpty() && currPrice > Stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                Span[i] = i+1;
            }
            else {
                int prevhigh = s.peek();
                Span[i] = i - prevhigh;
            }
            s.push(i); 
        }
    }
    public static void main(String[] args) {
        int Stocks[] = {100,80,60,70,60,85,100};
        int Span[] = new int[Stocks.length];
        stockspan(Stocks, Span);
        for (int i=0; i<Span.length; i++) {
            System.out.print(Span[i] + " ");
        }
    }
}
