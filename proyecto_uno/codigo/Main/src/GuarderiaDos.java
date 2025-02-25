import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GuarderiaDos {
        public static void main(String[] args) {

            Daycare guarderia = new Daycare("Guardería Infantil", "123456789");

            // Solicitar información por medio de una interfaz
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño: ");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del niño: "));
            char gender = JOptionPane.showInputDialog("Ingrese el género del niño: ").charAt(0);
            String Id = JOptionPane.showInputDialog("Ingrese el número de documento: ");
            String Alergias = JOptionPane.showInputDialog("Ingrese una alergia del niño: ");
            String AttendantName = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
            String ContactNumber = JOptionPane.showInputDialog("Ingrese el número de contacto: ");

            // Crear objeto Child y agregarlo a la guardería
            Child child = new Child(nombre, age, gender, Id, Alergias, AttendantName, ContactNumber);
            guarderia.agregarChild(child);

            // Mostrar lista de niños
            guarderia.listarChildren();
        }

        public static class Child {
            private String nombre;
            private int age;
            private char gender;
            private String Id;
            private String Alergias;
            private String AttendantName;
            private String ContactNumber;

            public Child(String nombre, int age, char gender, String Id, String Alergias, String AttendantName, String ContactNumber) {
                this.nombre = nombre;
                this.age = age;
                this.gender = gender;
                this.Id = Id;
                this.AttendantName = AttendantName;
                this.ContactNumber = ContactNumber;
                this.Alergias = Alergias;
            }

            public String getNombre() {
                return nombre;
            }

            ;

            public int getAge() {
                return age;
            }

            ;

            public char getGender() {
                return gender;
            }

            ;

            public String getId() {
                return Id;
            }

            ;

            public String getAttendantName() {
                return AttendantName;
            }

            ;

            public String getContactNumber() {
                return ContactNumber;
            }

            ;

            public String getAlergias() {
                return Alergias;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void setGender(char gender) {
                this.gender = gender;
            }

            ;

            public void setId(String Id) {
                this.Id = Id;
            }

            ;

            public void setAttendantName(String AttendantName) {
                this.AttendantName = AttendantName;
            }

            ;

            public void setContactNumber(String ContactNumber) {
                this.ContactNumber = ContactNumber;
            }

            ;

            public void setAlergias(String alergias) {
                this.Alergias = alergias;
            }

            // Se sobrescribe el toString para mostrar la información del objeto
            public String toString() {
                return "Nombre: " + nombre + "\n" + "Edad: " + age + "\n" + "Genero: " + gender + "\n" + "Número de identificación: "
                        + Id + "\n" + "Nombre del acudiente: " + AttendantName + "\n" + "Número de contacto: " + ContactNumber + "\n" + "Alergias: " + Alergias + "\n";
            }
        }

        public static class Daycare {
            private String nombre;
            private String nit;
            private List<Child> children;

                public Daycare(String nombre, String nit) {
                    this.nombre = nombre;
                    this.nit = nit;
                    this.children = new ArrayList<>();
                }

                public void agregarChild(Child child) {
                    children.add(child);
                    System.out.println("Niño agregado exitosamente.");
                }

                public void eliminarChild(String id) {
                    // size() devuelve la cantidad de elementos actuales en la lista.
                    for (int i = 0; i < children.size(); i++) {
                        // equals() compara el contenido del ID para verificar si son iguales.
                        if (children.get(i).getId().equals(id)) {
                            children.remove(i);
                            System.out.println("Niño eliminado exitosamente.");
                            return;
                        }
                    }
                    System.out.println("No se encontró un niño con este ID.");
                }

                public void actualizarChild(String id, Child updatedChild) {
                    for (int i = 0; i < children.size(); i++) {
                        if (children.get(i).getId().equals(id)) {
                            children.set(i, updatedChild);
                            System.out.println("Niño actualizado exitosamente.");
                            return;
                        }
                    }
                    System.out.println("No se encontró un niño con este ID.");
                }

                public void listarChildren() {
                    if (children.isEmpty()) {
                        System.out.println("No hay niños registrados.");
                    } else {
                        for (Child child : children) {
                            System.out.println(child);
                        }
                    }
                }

                public String getNombre() {
                    return nombre;
                }

                public String getNit() {
                    return nit;
                }

                public void setNombre(String nombre) {
                    this.nombre = nombre;
                }

                public void setNit(String nit) {
                    this.nit = nit;
                }
        }

}
