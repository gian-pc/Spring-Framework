package com.gianpc.IoC;

public class Secretario implements Empleados {

    @Override
    public String getTareas() {
        
        return "Secretario: Gestionar la agenda de los jefes";
    }

}