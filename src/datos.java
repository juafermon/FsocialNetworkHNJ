public class datos {


    String  descripcion;
    int idTrabajo;
    int horasTrabajo;
    float precioMateriales;
    float precioreparacion;
    float precioTotal;
    static String estado;

    public static int idTra = 1;
    //Constructor
    public datos(String desc) {
        descripcion = desc;
        idTrabajo = idTra++;
        horasTrabajo = 0;
        precioMateriales = 0;
        precioreparacion = 0;
        precioTotal = 0;

    }

    //setters
    public  void setidTrabajo(int identificador){
        idTrabajo=identificador+idTrabajo;
    }

    public  void setHorasTrabajo(int subirHoras){
        horasTrabajo = subirHoras+horasTrabajo;
    }

    public  void setprecioMateriales(float precioAaumentar){
        precioMateriales = precioAaumentar+precioMateriales;
    }

    public  void setEstado(){
        estado = "Finalizado";
    }




    //getters
    public int getIdTrabajo(){
        return idTrabajo;
    }

    public int getHorasTrabajo(){
        return horasTrabajo;
    }

    public float getprecioMateriales(){
        return precioMateriales;
    }

    public String getestado(){
        return estado;
    }



    }
