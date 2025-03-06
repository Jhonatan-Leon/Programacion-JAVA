public class Empleado {
    private String nombre;
    private String Id;
    private String cargo;
    private int TimpoEmpresa;
    private double salario;

    public Empleado(String nombre, String Id, String cargo, int TimpoEmpresa) {
        this.Id = Id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.TimpoEmpresa = TimpoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTimpoEmpresa() {
        return TimpoEmpresa;
    }

    public void setTimpoEmpresa(int TimpoEmpresa) {
        this.TimpoEmpresa = TimpoEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return nombre + " \n" + Id + "\n " + cargo + "\n " + TimpoEmpresa;
    }
}
