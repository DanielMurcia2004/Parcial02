public abstract class Departamento {
    //atributos
    private int empleados;
    private String ocupacionDepartamento;

    //creacion de constructor
    public Departamento(int empleados, String ocupacionDepartamento) {
        this.empleados = empleados;
        this.ocupacionDepartamento = ocupacionDepartamento;
    }

    //metodos de la clase
    public int getEmpleados(){
        return empleados;
    }

    public String getOcupacionDepartamento(){
        return ocupacionDepartamento;
    }
}
