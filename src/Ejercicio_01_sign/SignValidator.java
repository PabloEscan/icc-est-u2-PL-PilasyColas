package Ejercicio_01_sign;
import Materia.QueueG;
import Materia.stackG;

public class SignValidator {

        public boolean esValido(String s) {
        QueueG<Character> cola = new QueueG<>();

        for (int i = 0; i < s.length(); i++) {
            cola.add(s.charAt(i));
        }

        stackG<Character> pila = new stackG<>();

        while (!cola.isEmpty()) {
            char actual = cola.remove();

            if (actual == '(' || actual == '[' || actual == '{') {
                pila.push(actual);
            } else if (actual == ')' || actual == ']' || actual == '}') {
                if (pila.isEmpty()){
                    return false;
                }

                char tope = pila.pop();

                if (actual == ')' && tope != '(' || actual == ']' && tope != '[' || actual == '}' && tope != '{'){
                    return false;
                }
            }else {return false;}
        }
        return pila.isEmpty();
    }
}
