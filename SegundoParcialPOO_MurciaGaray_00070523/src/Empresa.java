public class Empresa {

    //atributos de la clase
        private  Empresa instance;
        private String nombreEmpresa;
        private String descripcion;


        //constructor
    public Empresa(Empresa instance, String nombreEmpresa, String descripcion) {
        this.instance = instance;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
    }

}
