/*
 * Curso programacion orientada a Objetos 150hs
 * Dias: Lunes, Miercoles y Viernes
 * Horario: 15hs a 18:30hs
 * Profesor: Carlos Ríos  email: c.rios@bue.edu.ar
 * 
 * Materiales: http://github.coom/crios2020/objetos-tarde-2022
 * 
 * Aulas Virtuales: 
 * Open Bootcamp.
 * 
 * Software: 
 * 
 *           JDK (Java Development Kit - Kit de Desarrollo de Java) 
 *              Oracle - IBM - Redhat - Amazon . Eclipse...
 *              Versiones LTS (Long Term Support 8 años)
 *              JDK 11 hasta Octubre 2024
 *              JDK 17 hasta Octubre 2026
 *              para ver la version, en CMD java -version
 *           
 *           IDE (Integrated Development Enviroment - Entorno de Desarrollo)
 *              VSCode - Eclipse for Java EE - Spring Tool Suite (spring.io/tools)
 *              IntelliJ Community - Netbeans.
 */

 public class Clase01{

    /**
     * Punto de entrada del proyecto Clase 1
     * @param args argumentos 
     */
     public static void main(String[] args) {
         //Punto de entrada

         //Linea de comentarios

         /*Bloque de comentarios */

         /**
          Java Doc
          Este comentario puede leerese desde fuera del binario y ejecutable
          lo puede leer el usurio final y los analistas
          Este comentario debe colocarse delante de la declaracion de clases o metodos.
          */

          //TODO Tarea pendiente!
    
          System.out.println("Hola Mundo");
          
          //String[] args vectors con argumentos que ingresan por consola

          System.out.println("Longitud de args: "+args.length);
          for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
          }

          //Lenguajes de tipado de datos fuente   Java C C++ C# Visual Basic TypeSctipt
          //Lenguajes de tipado de datos debil    JavaScript Python PHP

          //Tipo de datos primitivos
            //Tipos de datos enteros

            // Tipos de datos booleanos  1 byte (8)
            boolean bo=true;      // 1
            System.out.println(bo);
            bo=false;             // 0
            System.out.println(bo);


          }

          /**
           * suma los dos numeros que ingresan como parametro
           * @param nro1 numero 1
           * @param nro2 numero 2
           * @return resultado de la suma
           */
          public static int sumar (int nro1, int nro2){
            return 0;
     }
 }