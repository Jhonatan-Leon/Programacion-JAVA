import java.util.ArrayList;
import java.util.List;

public class GestionConsultorio {
    private ArrayList<Paciente> pacienteList;
    private ArrayList<Medico> mediocList;

    public GestionConsultorio() {
        pacienteList = new ArrayList<>();
        mediocList = new ArrayList<>();
    }


    public void addPaciente(Paciente paciente){
        pacienteList.add(paciente);
    }

    public void addMedico(Medico medico) {
        mediocList.add(medico);
    }


    public List<Paciente> obtenerPacientes() {
        List<Paciente> pacientesConHistorialMayorA5 = new ArrayList<>();

        for (Paciente p : pacienteList) {
            if (p.NumeroHistoriaClinica() > 5) {
                pacientesConHistorialMayorA5.add(p);
            }
        }

        return pacientesConHistorialMayorA5;
    }


}
