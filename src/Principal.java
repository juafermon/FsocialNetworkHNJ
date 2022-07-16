import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    /*registrar, consultar y actualizar los trabajos (reparaciones y revisiones)
   cada trabajo se identifica con el identificador de trabajo (asociar este identificador con un numero)
   todos los trabajos incluyen el numero de horas que van siendo necesarias para su realización
   los trabajos incluyen una pequeña descripcion
   cuando se marca como finalizado el trabajo no puede modificarse la cantidad de horas realizadas
   al momento de registrar una reparacion el precio del material es 0 y va aumentando de ser necesario

   se cobra multiplicando el numero de horas empleadas por 30 lucas.

  */
    static ArrayList<datos> arregloDatos = new ArrayList();
    int d =0;
    public static void main(String[] args) {
        //atrbas = atributos básicos, temp*** = temporal


        Menu menucito = new Menu();
        menucito.menu();



    }

}
