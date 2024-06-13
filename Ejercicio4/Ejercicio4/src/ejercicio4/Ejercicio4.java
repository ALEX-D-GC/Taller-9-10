package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear un jefe
        Jefe jefe = new Jefe(5000.0, "Bryan", "Alao", "Av.Gran Colombia", "12345678A");
        System.out.println("Información del Jefe:");
        System.out.println(jefe.toString() + ", Sueldo: $" + jefe.getSueldo());

        //Trabajador fijo mensual
        FijoMensual fijoMensual = new FijoMensual(3000.0, "Marco", "García", "Avenida Occidental", "98765432B");
        System.out.println("Información del Trabajador Fijo Mensual:");
        System.out.println(fijoMensual.toString() + ", Sueldo: $" + fijoMensual.getSalarioMensual());

        // Trabajador comisionista
        Comisionista comisionista = new Comisionista(20000.0, "Luis", "Ceballos", "Sauces Norte", "45678912C");
        comisionista.calcularSalario();
        System.out.println("Información del Trabajador Comisionista:");
        System.out.println(comisionista.toString() + ", Sueldo: $" + comisionista.getSalario());

        // Trabajador por horas
        PorHoras porHoras = new PorHoras(50, "Suany", "Chalan", "Sauces", "78912345D");
        System.out.println("Información del Trabajador por Horas:");
        System.out.println(porHoras.toString() + ", Sueldo: $" + porHoras.calcularSueldo());
    }
}
