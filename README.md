# PL - Validación de Signos y Ordenamiento de Pilas Genéricas

## 📌 Información General
- **Título:** PL - Validación de signos y ordenamiento de pilas genéricas
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Pablo Esteban Escandón Lema
- **Fecha:** 7 de junio de 2025
- **Profesor:** Ing. Pablo Torres

---
---
## 🛠️ Descripción

Este proyecto implementa dos funcionalidades principales usando estructuras de datos genéricas (`stackG<T>` y `QueueG<T>`):

1. **Validación de signos balanceados:**  
   Utiliza una cola (`QueueG<Character>`) para procesar los caracteres de la cadena en orden y una pila (`stackG<Character>`) para validar el correcto cierre de los signos.  
   - Soporta los signos: `()`, `{}`, `[]`.  
   - Retorna `true` si todos los signos tienen un cierre, y `false` en caso contrario.

2. **Ordenamiento de pila de enteros:**  
   Implementa un algoritmo para ordenar los elementos de una pila de enteros en orden ascendente usando una pila auxiliar.  
   - Se utiliza la clase `StackSorter` que ordena la pila in-place sin usar estructuras externas distintas a una pila auxiliar.

La pila genérica está implementada con nodos enlazados (`NodeGeneric<T>`) y soporta operaciones básicas como `push`, `pop`, `peek`, `isEmpty`, y métodos extra como `printStack`.

---
---
## 🧑‍💻 Ejemplo de Uso


```java
public class App {
    public static void main(String[] args) throws Exception {
        // Validar cadena de signos balanceados
        String signos = "{([()])}";
        SignValidator sV = new SignValidator();
        boolean valido = sV.esValido(signos);
        System.out.println(valido);  // Salida: true

        // Crear pila de enteros
        stackG<Integer> stackNumerico = new stackG<>();
        stackNumerico.push(5);
        stackNumerico.push(1);
        stackNumerico.push(4);
        stackNumerico.push(2);

        System.out.println("Antes de ordenar:");
        stackNumerico.printStack(); // Ejemplo: 2 | 4 | 1 | 5 |

        // Ordenar la pila
        StackSorter sS = new StackSorter();
        sS.sortStack(stackNumerico);

        System.out.println("Después de ordenar:");
        stackNumerico.printStack(); // Salida ordenada: 1 | 2 | 4 | 5 |
    }
}
```

---
---
## 📚 Detalles Técnicos

- **Clase `stackG<T>`:** Implementación genérica de pila basada en nodos enlazados.
- **Clase `NodeGeneric<T>`:** Nodo genérico con referencia al siguiente nodo.
- **Clase `QueueG<T>`:** Implementación genérica de cola utilizada para recorrer la cadena carácter por carácter.
- **Clase `SignValidator`:** Valida cadenas con signos balanceados usando una cola y una pila.
- **Clase `StackSorter`:** Ordena pilas de enteros mediante una pila auxiliar.

---
---
## ⚙️ Cómo compilar y ejecutar

2. Coloca las clases en sus respectivos paquetes (`Materia`, `Ejercicio_01_sign`, `Ejercicio_02_sorting`).
3. Compila todas las clases:
   ```bash
   javac Materia/
   java Ejercicio_01_sign/
   java Ejercicio_02_sorting/
   java App.java
   ```
4. Ejecuta la clase principal:
   ```bash
   java App
   ```

---
---
