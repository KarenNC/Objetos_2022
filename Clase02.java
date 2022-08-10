public class Clase02 
{
    public static void main(String[] args)
    {
        
    
        /*tipos de datos booleanos(entero): utiliza 1 bit de espacio en RAM pero ocupa 1 byte de memoria
        un booleano almacena un bit y ocupa en memoria 8 bytes
        la unidad de medida del SO es el byte

        boolean=true;
        10000000
        ******** "desperdicio" de 7 bits

        es mas costoso intentar ahorrar espacio que desperdiciar el byte
        */

        //tipo de datos byte signed(con signo)      1 byte
        byte by=100;
        System.out.println(by);
        /*
         * byte unsigned
         * |---------|
         * 0        255
         *  byte signed
         * |-------|-------|
         * -128    0    127
         */
        by=127;
        System.out.println(by);
        //by=128;
        System.out.println(by);
        //by=128 //Error overfloat

        //tipo de datos enteros short 2 bytes signed
        short sh=-32000;
        System.out.println(sh);
        //sh=36000;
        //sh=36000 //error

        //tipo de datos int 4 bytes 32 bits 4k millones de numeros signed
        int in=-2000000000;
        System.out.println(in);
        in=2000000000;
        System.out.println(in);
        //in=3000000000;
        //error overflow

        //tipo de datos long 8 bytes 64 bits signed

        //long lo=3000000000;
        //error la literal corresponde a un entero y no a un long. Se coloca una L 
        long lo=3000000000L;
        lo=2L;
        
        //Clase BigDecimal resuelve numeros de longitud entera o decimal a nuestro gusto

        /*tipo de datos char unsigned 2 bytes (Unicode)
         guarda un entero pero imprime un char*/
         char ch=65;
         System.out.println(ch);
         ch+=32;
         System.out.println(ch);

         ch='h';
         System.out.println(ch);

        //tipo de datos punto flotante

        //tipo de datos float 32 bits
        float ft=0.26f; //literal de escribir tipo float
        System.out.println(ft);
        //tipo de datos double 64 bits
        double dl=6.26;
        System.out.println(dl);

        ft=10;
        dl=10;

        System.out.println(ft/3);
        System.out.println(dl/3);

        ft=100;
        dl=100;

        System.out.println(ft/3);//se pierde un digito de precisión
        System.out.println(dl/3);
        //el punto se mueve "flota" de un lado a otro de la expresion

        ft=1;
        dl=1;

        System.out.println(ft/3);
        System.out.println(dl/3);

        //Clase String (no es un tipo de dato primitivo. Representa una cadena de caracteres)
        String st="hola";
        System.out.println(st);

        /*
         *JDK 10 o sup private final byte[] value;4 bytes
         *JDK 9 o inf private final char [] value; 8 bytes 
        */
        
        String cadena="Esto es una cadena de texto!";
        //System.out.println(cadena.value[1]);
        //Recorrido de cadena
        for (int i=0;i<cadena.length();i++)
        {
            System.out.print(cadena.charAt(1));

        }
        System.out.println();
        //imprimir cadena en mayusculas
        for(int i=0;i<cadena.length();i++)
        {char car=cadena.charAt(1);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }

        //operador unario
        in++;
        //operador binario
        in-=4;
        //Operador ternario 
        for (int i=0;i<cadena.length();i++){
            char car=cadena.charAt(1);
            System.out.print(!(car>=97 && car<=122)?car-32:car);
        }

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.contains("hola"));
        System.out.println(cadena.contains("texto"));
         
    }
    
}
