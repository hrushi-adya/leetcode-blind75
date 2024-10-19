// Class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for(char c: s.toCharArray()) {
//             if(c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//             } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
//                 stack.pop();
//             } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
//                 stack.pop();
//             } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
//                 stack.pop();
//             } else {
//                 return false;
//             }
//         }
//         return stack.isEmpty();
//     }
// }

 Class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        
        bracketMap.put(')','(');
        bracketMap.put('[',']');
        bracketMap.put('{','}');

        for(char c: s.toCharArray()) {
            if(bracketMap.containsKey(c)) {
                if(!brackets.isEmpty() && bracketMap.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(c);
            }
        }

        return stack.isEmpty();
    }
}
