package com.gianpc.IoC;


public class UsoEmpleados {

    public static void main(String[] args) {
        
        // Creación de objetos de tipo Empleado

        Empleados Empleado1 = new Director();
        Empleados Empleado2 = new Jefe();
        Empleados Empleado3 = new Secretario();

        // Uso de los objetos creados
        System.out.println(Empleado1.getTareas()); // Director: Gestionar la dirección de la empresa
        System.out.println(Empleado2.getTareas()); // Jefe: Gestionar la planilla de la empresa
        System.out.println(Empleado3.getTareas()); // Secretario: Gestionar la agenda de los jefes

    
    }
}
