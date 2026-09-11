class Solution {
    public boolean isValid(String s) {
        
       if(s.length()%2 != 0){
        return false;
       }

       char[] arr = s.toCharArray();

       Stack<Character> stk = new Stack<Character>();

       for(int i = 0; i<arr.length;i++){

          if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{'){
            stk.push(arr[i]);
          }
          else if(arr[i] == ')' && !stk.isEmpty() && stk.peek() == '('){
             stk.pop();
          }
          else if(arr[i] == ']' && !stk.isEmpty() && stk.peek() == '['){
             stk.pop();
          }
          else if(arr[i] == '}' && !stk.isEmpty() && stk.peek() == '{'){
             stk.pop();
          }
          else {
             return false;
          }

       }

       return stk.isEmpty();

    }
}
