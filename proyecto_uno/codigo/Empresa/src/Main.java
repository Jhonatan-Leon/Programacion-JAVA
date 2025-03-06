import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Empresa miEmpresa = new Empresa("LasArepas", "37462734734");
        miEmpresa.CargarDatos();

        while(true) {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Ver empleados ordenados por salario (Mayor a Menor)\n" +
                            "2. Ver empleados ordenados por salario (Menor a Mayor)\n" +
                            "3. Calcular nómina con aumentos\n" +
                            "4. Salir"
            );

            if (opcion == "4"){
                break;
            }

            switch (opcion) {
                case "1":
                    Empleado[] empleadosMayor = miEmpresa.OrdernarMayorMneor();
                    break;
                case "2":
                    Empleado[] empleadosMenor = miEmpresa.OrdernarMenor();
                    break;
                case "3":
                    miEmpresa.CalcaulNomina();
                    JOptionPane.showMessageDialog(null, "Nómina actualizada con aumentos.");
                    break;
            }
        }

    }



}
