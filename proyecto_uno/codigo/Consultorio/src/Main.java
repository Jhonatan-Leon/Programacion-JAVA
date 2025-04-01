import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        GestionConsultorio gestion = new GestionConsultorio();
        String menu = "1. Agregar paciente\n2. Mostrar pacientes con historia clínica > 5\n3. Salir";
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre del paciente:");
                    int numeroHistoriaClinica = Integer.parseInt(JOptionPane.showInputDialog("Número de historia clínica:"));
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    String telefono = JOptionPane.showInputDialog("Teléfono:");
                    String fechaUltimaConsulta = JOptionPane.showInputDialog("Fecha de última consulta:");
                    int cantidadTratamiento = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de tratamientos:"));

                    Paciente paciente = new Paciente(numeroHistoriaClinica, nombre, edad, telefono, fechaUltimaConsulta, cantidadTratamiento);
                    gestion.addPaciente(paciente);
                    JOptionPane.showMessageDialog(null, "Paciente agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    List<Paciente> pacientes = gestion.obtenerPacientes();
                    StringBuilder resultado = new StringBuilder("Pacientes:\n");
                    for (Paciente p : pacientes) {
                        resultado.append(p).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, pacientes.isEmpty() ? "No hay pacientes con historia clínica > 5." : resultado.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 3);
    }
}