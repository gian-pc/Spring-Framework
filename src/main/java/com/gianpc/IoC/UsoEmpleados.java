package com.gianpc.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

    public static void main(String[] args) {
        
        // Para usa el contenedor de Spring hay que seguir los siguientes pasos:

        // 1. Cargar el archivo de configuración(applicationContext.xml) de Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 2. Pedir al contenedor de Spring un bean
        Empleados Juan = context.getBean("miEmpleado", Empleados.class);
        
        // 3. Usar el bean
        System.out.println(Juan.getTareas()); // Secretario: Gestionar la agenda de los jefes
    
        // 4. Cerrar el contenedor de Spring
        context.close();

    
    }
}
