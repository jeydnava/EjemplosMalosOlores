package Dispensables;

//Ejemplo de Comments
public class Calculator {
    public int add(int a, int b) {
        // Suma dos números enteros y devuelve el resultado
        return a + b;
    }

    public void processData(List<String> data) {
        // Itera sobre la lista de datos
        for (String item : data) {
            // Imprime cada item en la consola
            System.out.println(item);
        }
    }
}

/*
 *  Los comentarios "Suma dos números enteros y devuelve el resultado" y "Itera sobre la lista de datos" son completamente redundantes. 
 * El código return a + b; y for (String item : data) ya son autoexplicativos. Estos comentarios no añaden valor, sino que simplemente 
 * duplican lo que el código ya expresa claramente, lo que puede llevar a que los comentarios se desactualicen y confundan a futuro. 
 */
