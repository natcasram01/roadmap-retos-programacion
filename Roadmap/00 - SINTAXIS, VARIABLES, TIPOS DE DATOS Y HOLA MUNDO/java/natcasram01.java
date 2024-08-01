import java.math.BigDecimal;

// Comentario de una sola linea
// URL Java: https://www.java.com/es/

/* Comentario de bloque
    Ejercicio #00 del reto de programacion de mouredev
    @author nataliacr
    @version 1.0
 */ 


 public class natcasram01{
    public static void main(String[] args){
    
        // Declarando tipos primitivos (8)


        Byte b = (byte)100;          // 8-bit [-128, 127]

        short sh = 1000;       // 16-bit [-32768, 32767]

        int variable;           // 32-bit con signo
        int constante = -2;

        double valor = 555.5;   // 64-bit
        double v = 5.555e2;     // notación científica

        float valor2 = 555.5F;   // 32-bit
        float v2 = 555.5F;      // literal float para indicar que es float (por defecto los float se consideran double)

        long l = 888;           // 64-bit
        long l2= 888L;          // literal long para indicar que es long y no int

        char c = 'C';

        boolean casilla = true;
        boolean casilla2 = Boolean.TRUE;    // usando clase envolente


        // Clases casi se podrian considerar de tipos primitivos

        String s = "hola";      // s es un objeto inmutable

        Integer i = 8;          // i es un objeto de tipo Integer, que contiene un valor de tipo int. 
                                // Integer permite hacer un toString y viceversa. Tambien permite apliar ciertos métodos a ints.

        BigDecimal bd;          // bd es un objeto inmutable para calculos de precision con numeros decimales
                                // *** inmutabilidad: una vez creado un BD su valor es inmutable y las operaciones con BDs realmente crean nuevos BD



        // Imprime por el terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"

        String lenguaje = "Java";

        System.out.println("¡Hola, " + lenguaje + "!");
    }
}


