// Question - Push at the bottom of the stack?
//   input : data = 5
//   Output:
//   4
//   3
//   2
//   1
//   5

Solutions 

  
  
import java.util.Stack;
public class Ajay {
  public static void pushBottom(Stack<Integer> list, int data) {
    if(list.isEmpty()) {
      list.push(data);
      return;
    }
    int top = list.pop();
    pushBottom(list, data);
    list.push(top);
  }
  public static void main(String[] args) {
    Stack<Integer> list = new Stack<>();
    list.push(1);
    list.push(2);
    list.push(3);
    list.push(4);

    //calling function
    pushBottom(list, 5);

    while(!list.isEmpty()) {
      System.out.println(list.pop());
    }
  }
}
  
  
