// Question - Reverse a String using a Stack?
//   input : "abc"
//   output : "cba"


import java.util.Stack;

public class Ajay {
  public static String reverseString(String str) {
    Stack<Character> list = new Stack<>();
    int idx = 0;
    // add the string in stack
    while(idx < str.length()) {
      list.push(str.charAt(idx));
      idx++;
    }

    //remove the string from stack - using StringBuilder
    StringBuilder sb = new StringBuilder("");
    while(!list.isEmpty()) {
      char current = list.pop();
      sb.append(current);
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String str = "abc";
    //calling function
    String result = reverseString(str);
    System.out.println(result);
    
  }
}
