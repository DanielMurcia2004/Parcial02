public class DepartamentoPrincipal extends Departamento{
    //se hereda el constructor de la clase departamento
    public DepartamentoPrincipal(int empleados, String ocupacionDepartamento) {
        super(empleados, ocupacionDepartamento);
    }

    @Override
    public int getEmpleados(){
        return getEmpleados();
    }

    @Override
    public String getOcupacionDepartamento(){
        return getOcupacionDepartamento();
    }
}
