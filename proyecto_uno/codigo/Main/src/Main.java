//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /*
    Problema de sistema para almacenar información de un empleado
     */

    public static void main(String[] args) {

        Empleado newEmpleado = new Empleado("Luis", "484948949", "Empleado","prueba@gmail.com", 49849894, "2000-20-02");
        System.out.println(newEmpleado.getNombre());
        System.out.println(newEmpleado.getId());
        System.out.println(newEmpleado.getCorreo());
        System.out.println(newEmpleado.getPuesto());
        System.out.println(newEmpleado.getTelefono());
        System.out.println(newEmpleado.getFechaContratacion());
    }

    public static class Empleado{
        private String nombre;
        private String Id;
        private String puesto;
        private String correo;
        private int telefono;
        private String FechaContratacion;

        public Empleado(String nombre, String id, String puesto, String correo, int telefono, String FechaContratacion) {
            this.nombre = nombre;
            this.Id = id;
            this.puesto = puesto;
            this.correo = correo;
            this.telefono = telefono;
            this.FechaContratacion = FechaContratacion;
        };

        public String getNombre() {
            return nombre;
        };

        public String getId() {
            return Id;
        };

        public String getPuesto() {
            return puesto;
        };

        public String getCorreo() {
            return correo;
        };

        public int getTelefono() {
            return telefono;
        };

        public String getFechaContratacion() {
            return FechaContratacion;
        };

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        };

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        };

        public void setFechaContratacion(String FechaContratacion) {
            this.FechaContratacion = FechaContratacion;
        };

    }

}

