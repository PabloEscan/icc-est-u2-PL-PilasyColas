package Ejercicio_01_sign;

import Materia.stackG;

public class SignValidator {

    public boolean esValido(String signos) {
        stackG<Character> stack = new stackG<>();

        for (int i = 0; i < signos.length(); i++) {
            char c = signos.charAt(i);

            if (c == '(') {
                stack.push(c);
            }else if( c == '{' ){
                stack.push(c);
            }else if( c == '['){
                stack.push(c);
            }else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }else if (c==']') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }else if (c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
