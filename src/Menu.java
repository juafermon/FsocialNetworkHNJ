import java.util.Scanner;



public class Menu {

        public void menu (){

        Scanner men= new Scanner(System.in);
        boolean cond1=true;
        while(cond1==true) {
            System.out.println("1. Registrar trabajo. ");
            System.out.println("2. Aumentar horas. ");
            System.out.println("3. Aumentar coste de piezas. ");
            System.out.println("4. Finalizar trabajo. ");
            System.out.println("5. Muestra trabajo. ");


            int menuop = men.nextInt();
            switch (menuop) {
                //Registrar trabajo
                case 1:

                    //para descripcion
                    String tempDesc = " ";
                    System.out.println("Ingrese descripción: ");
                    Scanner ingDes = new Scanner(System.in);
                    tempDesc = ingDes.nextLine();


                    datos atrBas = new datos(tempDesc);
                    Principal.arregloDatos.add(atrBas);

                    cond1 = feedBack(cond);
                    //System.out.println(Principal.arregloDatos.get(idTr-1).idTrabajo);

                    break;
                //Aumentar horas
                case 2:
                    int identificadorhoras=0;
                    int aumentoHoras;
                    int pruebaaa;
                    boolean condhoras=true;

                    while(condhoras) {

                        System.out.println("Ingrese el identificador: ");
                        Scanner scanIdtrabajo = new Scanner(System.in);
                        identificadorhoras = scanIdtrabajo.nextInt();



                        if (identificadorhoras > Principal.arregloDatos.size()) {
                            System.out.println("el trabajo ingresado no existe, vuelva a ingresar");

                        } else {
                            condhoras = false;
                        }
                    }

                    System.out.println("Ingrese la cantidad de horas que desea aumentar: ");
                    Scanner scanHoras = new Scanner(System.in);
                    aumentoHoras = scanHoras.nextInt();

                        Principal.arregloDatos.get(identificadorhoras - 1).setHorasTrabajo(aumentoHoras);

                        System.out.println(Principal.arregloDatos.get(identificadorhoras - 1).idTrabajo + "id");
                        System.out.println("Horas del trabajo.");
                        System.out.println(Principal.arregloDatos.get(identificadorhoras - 1).horasTrabajo + "horas agg");

                        cond1 = feedBack(cond);


                    break;


                //Aumentar coste de piezas
                case 3:

                    System.out.println("Ingrese el identificador: ");
                    Scanner scanIdtrabajoprecio = new Scanner(System.in);
                    int identificadorprecio = scanIdtrabajoprecio.nextInt();

                    System.out.println("Ingrese el precio de los materiales: ");
                    Scanner scanPrecios = new Scanner(System.in);
                    float aumentoPrecioMateriales = scanPrecios.nextFloat();

                    Principal.arregloDatos.get(identificadorprecio - 1).setprecioMateriales(aumentoPrecioMateriales);
                    System.out.println(Principal.arregloDatos.get(identificadorprecio - 1).idTrabajo + "");
                    System.out.println("Precio Materiales");
                    System.out.println(Principal.arregloDatos.get(identificadorprecio - 1).precioMateriales);

                    cond1 = feedBack(cond);

                    break;

                //Finalizar trabajo
                case 4:
                    System.out.println(" Ingrese el identificador del trabajo al que desea finalizar  ");
                    Scanner scanIdtrabajoFinalizacion = new Scanner(System.in);
                    int identificadorFinalizacion = scanIdtrabajoFinalizacion.nextInt();

                    Principal.arregloDatos.get(identificadorFinalizacion - 1).setEstado();

                    System.out.println(Principal.arregloDatos.get(identificadorFinalizacion - 1).estado);

                    cond1 = feedBack(cond);

                    break;


                //Muestra trabajo
                case 5:

                    System.out.println(" Ingrese el identificador del trabajo que desea visualizar  ");
                    Scanner scanIdtrabajoMostrar = new Scanner(System.in);
                    int identificadorMostrar = scanIdtrabajoMostrar.nextInt();

                    System.out.println(Principal.arregloDatos.get(identificadorMostrar - 1).getIdTrabajo());
                    System.out.println(Principal.arregloDatos.get(identificadorMostrar - 1).getestado());
                    System.out.println(Principal.arregloDatos.get(identificadorMostrar - 1).getHorasTrabajo());
                    System.out.println(Principal.arregloDatos.get(identificadorMostrar - 1).getprecioMateriales());

                    cond1 = feedBack(cond);

                    break;


                default:
                    System.out.println("Opción invalida. ");


            }
        }
    }

    boolean cond=true;
    public boolean feedBack(boolean cond){

        System.out.println("   ¿Desea realizar algo mas?. (S) Sí. (N) No.  ");
        Scanner volver2 = new Scanner(System.in);
        String feedbackvolver = volver2.nextLine();

        if(feedbackvolver.toUpperCase().equals("S")) {
            Menu menu = new Menu();
            menu.menu();

            }
        else{
            cond =false;
            System.out.println();
        }
        return cond;
    }
}