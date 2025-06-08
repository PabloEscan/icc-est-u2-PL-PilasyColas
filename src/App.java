import Ejercicio_02_sorting.StackSorter;
import Materia.stackG;
import Ejercicio_01_sign.SignValidator;
public class App {
    public static void main(String[] args) throws Exception {
        String signos = "{([()])}";
        SignValidator sV = new SignValidator();
        boolean tF = sV.esValido(signos);
        System.out.println(tF + "");



        stackG<Integer> stackNumerico = new stackG<>();
        stackNumerico.push(5);
        stackNumerico.push(1);
        stackNumerico.push(4);
        stackNumerico.push(2);

        System.out.println("Antes de ordenar:");
        stackNumerico.printStack();
        StackSorter sS = new StackSorter();
        sS.sortStack(stackNumerico);
        System.out.println("Después de ordenar:");
        stackNumerico.printStack();
    }
}
