package StockSpan;
import java.util.*;

public class StockSpan{
    Stack<Integer>s;
    StockSpan(){
        s = new Stack<Integer>();
    }
    public void FindSpan(int a[], int span[], int n){
        for(int i=0; i<n; i++){
            while((!s.isEmpty())&&(a[s.peek()]<=a[i])){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i-s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        StockSpan stack = new StockSpan();
        int n = 7;
        int a[] ={100, 80, 60, 70,60,75,85};
        int span[] = new int[a.length];
        stack.FindSpan(a, span, n);
        for (int i=0; i<n; i++){
            System.out.print(span[i]);
        }
    }
}