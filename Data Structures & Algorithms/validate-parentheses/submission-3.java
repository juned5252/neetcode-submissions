class Solution {
    public boolean isValid(String s) {

      char[] arr = s.toCharArray();
      Stack<Character> stack = new Stack<Character>();

      for(char c: arr){
         if(c == '(' || c == '{' || c == '['){
            stack.push(c);
         }
         else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
              stack.pop();
         }
          else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
              stack.pop();
         }
          else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
              stack.pop();
         }
         else return false;
      }

      return stack.isEmpty();
        
    }
}
