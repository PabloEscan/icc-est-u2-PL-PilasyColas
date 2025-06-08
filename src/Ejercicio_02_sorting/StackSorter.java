package Ejercicio_02_sorting;
import Materia.stackG;

public class StackSorter {
    public void sortStack(stackG<Integer> original) {
            stackG<Integer> aux  = new stackG<>();

            while (!original.isEmpty()) {
                int num = original.pop();

                while (!aux.isEmpty() && aux.peek() > num) {
                    original.push(aux.pop());
                }

                aux .push(num);
            }

            while (!aux.isEmpty()) {
                original.push(aux.pop());
            }
        }
}
