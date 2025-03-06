
public class Empresa {
    private String nombre;
    private String NIT;
    public Empleado[] empleados;

    public Empresa(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
        empleados = new Empleado[50];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int BuscarEmpleadoCC(String Cedula) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getId().equals(Cedula)) {
                return i;
            }
        }
        return -1;
    }

    public Empleado[] BuscarEmpleadoCargo(String Cargo) {
        int count = 0;

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getCargo().equals(Cargo)) {
                count++;
            }
        }

        Empleado[] ListCargoEm = new Empleado[count];
        int indice = 0;

        for(int i = 0; i < empleados.length; i++) {
            if (empleados[i].getCargo().equals(Cargo)) {
                ListCargoEm[indice] = empleados[i];
                indice++;
            }
        }
        return ListCargoEm;
    }

    public boolean EliminarEm(String Cedula){
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getId().equals(Cedula)) {
                empleados[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean ActualizarEm(String Cedula, Empleado empleado) {
        int posicion = BuscarEmpleadoCC(Cedula);

        if(posicion != -1){
            empleados[posicion] = empleado;
            return true;
        }
        return false;
    }

    public int ValidarCupo(){
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i] == null){
                return i;
            }
        }
        return -1;
    }

    public boolean CrearEmpleado(Empleado empleado) {
        int espacioL = ValidarCupo();

        if(espacioL == -1 && BuscarEmpleadoCC(empleado.getId()) == -1){
            empleados[espacioL] = empleado;
            return true;
        }
        return false;
    }

    public void CalcaulNomina(){
        for (Empleado E : empleados) {
            if(E != null){
                double salario = E.getSalario();
                int tiempo = E.getTimpoEmpresa();
                double aument = 0;

                if(tiempo > 10){
                    aument = 0.15;
                }else if(tiempo > 5){
                    aument = 0.10;
                }else if(tiempo > 3){
                    aument = 0.05;
                }

                double salarioFinal = salario * aument;
                E.setSalario(salarioFinal);
            }
        }
    }

    public Empleado[] OrdernarMayorMneor() {
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - i -1; j++) {
                if (empleados[j] != null && empleados[j + 1] != null && empleados[j].getSalario() < empleados[j + 1].getSalario()) {
                   Empleado listEmpleados = empleados[j];
                   empleados[j] = empleados[j + 1];
                   empleados[j + 1] = listEmpleados;
                }
            }
        }
        return empleados;
    }

    public Empleado[] OrdernarMenor() {
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - i -1; j++) {
                if (empleados[j] != null && empleados[j + 1] != null && empleados[j].getSalario() > empleados[j + 1].getSalario()) {

                    Empleado listEmpleados = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = listEmpleados;
                }
            }
        }
        return empleados;
    }

    public void CargarDatos(){
        String[] nombres = {"Carlos","Maria","pedro","Camilo","Juan"};
        String[] Cargos = {"Tecnico","Jefe","Gerente","Empleado"};

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                String nombre = nombres[(int) (Math.random()* nombres.length)];
                String cargo = Cargos[(int) (Math.random()* Cargos.length)];
                String id = String.valueOf((int) (Math.random()*20));
                int tiempo = (int) (Math.random()*15);
                double salario = 1300000 + Math.random() * 5000000;

                Empleado newempleado = new Empleado(nombre,id,cargo, tiempo);
                newempleado.setSalario(salario);
                empleados[i] = newempleado;
            }
        }
    }
}
