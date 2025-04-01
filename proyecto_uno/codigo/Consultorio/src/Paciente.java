public record Paciente( int NumeroHistoriaClinica, String nombre, int Edad, String Telefono,
                         String FechaUltimaConsulta, int CantidadTratamiento ) {
    @Override
    public String toString() {
        return "Paciente{" +
                "Historia Clínica=" + NumeroHistoriaClinica +
                ", Nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                ", Teléfono='" + Telefono + '\'' +
                ", Última Consulta='" + FechaUltimaConsulta + '\'' +
                ", Tratamientos=" + CantidadTratamiento +
                '}';
    }

}
