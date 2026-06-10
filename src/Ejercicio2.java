import java.util.ArrayDeque;

public class Ejercicio2 {
    public boolean esPalindromo(String texto){
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (char letra : texto.toCharArray())
            pila.push(letra);
        for (char letra : texto.toCharArray())
            if(letra != pila.pop()) return false;
        return true;
    }
}
