import java.util.ArrayDeque;
 
public class Ejercicio1 {
 

    public String invertString(String texto) {
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (char letra : texto.toCharArray())
            pila.push(letra);
        String invertido = "";
        while (!pila.isEmpty())
            invertido += pila.pop();
        return invertido;
    }
}