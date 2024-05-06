import java.util.Scanner;
public class Fechas {
    public static void main(String[] args) {
                //definicion de variables de tipo String para almacenar datos
                String fech1, fech2;
                String dia1, mes1, ann1;
                String dia2, mes2, ann2;
                //definicio de variables de tipo Integer
                int dia, mes, ann, di, me, an;
                // instancia de la Clase Scanner para recoger los datos desde el teclado
                Scanner lec = new Scanner(System.in);
                //Solicitud por pantalla para ingresar por teclado la primera fecha
                System.out.print("Ingrese la primera fecha como DD/MM/AAAA : ");
                //asignacion de dato ingresado a la variable
                fech1 = lec.nextLine();
                //Solicitud por pantalla para ingresar por teclado la segunda fecha
                System.out.print("Ingrese la Segunda fecha como DD/MM/AAAA : ");
                //asignacion de dato ingresado a la variable
                fech2 = lec.nextLine();
                //Separacion de de datos tipo integer para ser evaluados
                dia1 = fech1.substring(0, 2);
                mes1 = fech1.substring(3, 5);
                ann1 = fech1.substring(6);
                dia2 = fech2.substring(0, 2);
                mes2 = fech2.substring(3, 5);
                ann2 = fech2.substring(6);
                //asignacion de datos tipo String cambiado a Int para ser evaluados
                dia = Integer.parseInt(dia1);
                mes = Integer.parseInt(mes1);
                ann = Integer.parseInt(ann1);
                di = Integer.parseInt(dia1);
                me = Integer.parseInt(mes1);
                an = Integer.parseInt(ann2);
                //comparacion de datos tipo integer para evaluacion de la fecha
                if (ann < an){
                    System.out.println("persona 1 es mayor");
                } else if (ann > an) {
                    System.out.println("persona 2 es mayor");
                } else {
                    System.out.println("Tienen la misma edad");

                }
    }
}