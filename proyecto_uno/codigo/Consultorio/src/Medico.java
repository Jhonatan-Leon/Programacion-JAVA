public class Medico {
    private int Id;
    private String Nombre;
    private int NumeroLicencia;
    private  Especializacion Especialidad;

    public Medico(int id, String nombre, int NumeroLicencia, Especializacion especialidad) {
        this.Id = id;
        this.Nombre = nombre;
        this.NumeroLicencia = NumeroLicencia;
        this.Especialidad= especialidad;
    }

    public String getNombre(){
        return  Nombre;
    }

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumeroLicencia() {
        return NumeroLicencia;
    }

    public void setNumeroLicencia(int NumeroLicencia) {
        this.NumeroLicencia = NumeroLicencia;
    }

    public Especializacion getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Especializacion especialidad) {
        this.Especialidad = especialidad;
    }
}
