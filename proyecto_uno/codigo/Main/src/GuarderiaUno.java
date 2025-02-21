import javax.swing.*;

public class GuarderiaUno {
    public static void main(String[] args) {

        // Solicitar información por medio de una interfaz
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del niño: "));
        // charAT(0) obtiene el primer caracter de una cadena ej: Masculino = M
        char gender = JOptionPane.showInputDialog("Ingrese el genero del niño: ").charAt(0);
        String Id = JOptionPane.showInputDialog("Ingrese el número de documento: ");
        String AttendantName = JOptionPane.showInputDialog("Ingrese el nombre del Acudiente: ");
        String ContactNumber = JOptionPane.showInputDialog("Ingrese el número del Contacto: ");

       Child newChild = new Child( nombre, age, gender, Id, AttendantName, ContactNumber);

       // Mostrar mensaje en una interfaz
       JOptionPane.showMessageDialog(null, newChild);

       System.out.println(newChild.toString());

    }

    public static class  Child{
        private String nombre;
        private int age;
        private char gender;
        private String Id;
        private String AttendantName;
        private String ContactNumber;

        public Child(String nombre, int age, char gender, String Id, String AttendantName, String ContactNumber) {
            this.nombre = nombre;
            this.age = age;
            this.gender = gender;
            this.Id = Id;
            this.AttendantName = AttendantName;
            this.ContactNumber = ContactNumber;
        }

        public String getNombre() {
            return nombre;
        };

        public int getAge() {
            return age;
        };

        public char getGender() {
            return gender;
        };

        public String getId() {
          return Id;
        };

        public String getAttendantName() {
            return AttendantName;
        };

        public String getContactNumber() {
            return ContactNumber;
        };

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(char gender) {
            this.gender = gender;
        };

        public void setId(String Id) {
            this.Id = Id;
        };

        public void setAttendantName(String AttendantName) {
            this.AttendantName = AttendantName;
        };

        public void setContactNumber(String ContactNumber) {
            this.ContactNumber = ContactNumber;
        };

        // Se sobrescribe el toString para mostrar la información del objeto
        public String toString() {
            return "Nombre: "+ nombre + "\n" + "Edad: "+ age + "\n" +"Genero: "+ gender + "\n" +"Número de identificación: "
                    + Id + "\n" + "Nombre del acudiente: "+ AttendantName + "\n" + "Número de contacto: "+ ContactNumber;
        }
    }

}
