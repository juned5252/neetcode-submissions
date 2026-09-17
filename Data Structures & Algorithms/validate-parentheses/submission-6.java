class Solution {
    public boolean isValid(String s) {
        
         char[] arr = s.toCharArray();
         Stack<Character> stk = new Stack<Character>(); 

         for(char c :arr){
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }
            else if(c == ')' && !stk.isEmpty() && stk.peek() == '('){
                 stk.pop();
            }
            else if(c == '}' && !stk.isEmpty() && stk.peek() == '{'){
                 stk.pop();
            }
            else if(c == ']' && !stk.isEmpty() && stk.peek() == '['){
                 stk.pop();
            }
            else{
                return false;
            }
         }
          return stk.isEmpty();
    }
}
