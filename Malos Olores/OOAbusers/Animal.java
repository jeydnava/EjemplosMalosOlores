package OOAbusers;

//Ejemplo de Refuse Bequest
public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void fly(); // Todos los animales vuelan?
}

    public class Dog extends Animal {
        @Override
        public void eat() { System.out.println("Dog eats kibble."); }

        @Override
        public void sleep() { System.out.println("Dog sleeps."); }

        @Override
        public void fly() {
            // Un perro no puede volar. Este método debe ser implementado
            // pero no tiene sentido o debe lanzar una excepción.
            throw new UnsupportedOperationException("Dogs cannot fly.");
        }

        /*
         * La clase Dog hereda de Animal y, por lo tanto, está obligada a implementar el método fly(). Sin embargo, un perro 
         * no puede volar, lo que resulta en una implementación vacía, una implementación que lanza una excepción 
         * (UnsupportedOperationException), o una implementación que tiene un comportamiento incorrecto. 
         * Esto indica que la relación de herencia entre Animal y Dog no es completamente apropiada para todas las funcionalidades, 
         * ya que Dog "rechaza" o no necesita la capacidad de fly() que hereda de su superclase. 
         */
}
