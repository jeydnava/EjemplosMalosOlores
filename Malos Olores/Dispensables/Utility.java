package Dispensables;

//EJEMPLO DE DEAD CODE
public class Utility {
    public void oldFeatureMethod() {
        // Este método fue usado en una versión anterior, pero ya no se llama desde ninguna parte del código
        System.out.println("This is an old feature that is no longer used.");
    }

    public int calculateSum(int a, int b) {
        int sum = a + b;
        // if (false) { // Esta rama de código es inalcanzable
        //     System.out.println("This message will never be printed.");
        // }
        return sum;
    }

    public void doSomething() {
        String unusedVariable = "Hello"; // Esta variable nunca se usa
        System.out.println("Performing an action.");
    }
}

/*
 * El método oldFeatureMethod no es invocado por ninguna otra parte del código base, lo que lo convierte en código muerto. 
 * De manera similar, el bloque if (false) en calculateSum es inalcanzable, y la variable unusedVariable en doSomething nunca se lee. 
 * Este código no tiene ningún impacto en la ejecución del programa, pero permanece en la base de código, añadiendo ruido visual y 
 * aumentando la cantidad de código que los desarrolladores deben entender y mantener innecesariamente.
 */
